class Solution {
  public List<List<String>> accountsMerge(List<List<String>> accounts) {
    Map<String, String> emailToParent = new HashMap<>();
    Map<String, String> emailToName = new HashMap<>();
    UnionFind uf = new UnionFind();

    // Step 1: Populate the union-find structure and maps
    for (List<String> account : accounts) {
      String name = account.get(0);
      for (int i = 1; i < account.size(); i++) {
        String email = account.get(i);
        emailToName.put(email, name);
        uf.union(account.get(1), email);
      }
    }

    // Step 2: Group emails by their root parent
    Map<String, List<String>> rootToEmails = new HashMap<>();
    for (String email : emailToName.keySet()) {
      String root = uf.find(email);
      rootToEmails.putIfAbsent(root, new ArrayList<>());
      rootToEmails.get(root).add(email);
    }

    // Step 3: Prepare the result
    List<List<String>> mergedAccounts = new ArrayList<>();
    for (String root : rootToEmails.keySet()) {
      List<String> emails = rootToEmails.get(root);
      Collections.sort(emails);
      List<String> account = new ArrayList<>();
      account.add(emailToName.get(root));
      account.addAll(emails);
      mergedAccounts.add(account);
    }

    return mergedAccounts;
  }
}

// Union-Find Helper Class
class UnionFind {
  private Map<String, String> parent;

  public UnionFind() {
    parent = new HashMap<>();
  }

  public String find(String email) {
    if (!parent.containsKey(email)) {
      parent.put(email, email);
    }
    if (!email.equals(parent.get(email))) {
      parent.put(email, find(parent.get(email)));
    }
    return parent.get(email);
  }

  public void union(String email1, String email2) {
    String root1 = find(email1);
    String root2 = find(email2);
    if (!root1.equals(root2)) {
      parent.put(root1, root2);
    }
  }
}

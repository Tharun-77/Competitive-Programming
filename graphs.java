// This code is to convert edges array to ArrayList of graph pattern for a directed graph

List<List<Integer>> list = new ArrayList<>();

for(int i=0;i<V;i++){
  list.add(new ArrayList<Integer>());
}

for(int i[] : edges){
  int u = i[0];
  int v = i[1];
  list.get(u).add(v);
}

// This code is to convert edges array to ArrayList of graph pattern for a undirected graph

List<List<Integer>> list = new ArrayList<>();

for(int i=0;i<V;i++){
  list.add(new ArrayList<Integer>());
}

for(int i[] : edges){
  int u = i[0];
  int v = i[1];
  list.get(u).add(v);
  list.get(v).add(u);
}


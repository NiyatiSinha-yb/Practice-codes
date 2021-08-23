class ShuffleString {
    public String restoreString(String s, int[] indices) {
        String result="";
        Map <Integer, Character> inputMap= new HashMap<Integer, Character>();
        for(int i=0; i<s.length(); i++)
            inputMap.put(indices[i],s.charAt(i));
        //inputMap.forEach((k,v)-> result+=v.toString());
        for(Map.Entry entry : inputMap.entrySet())
            result+=entry.getValue().toString();
        //System.out.println(inputMap);
        return result;
    }
}

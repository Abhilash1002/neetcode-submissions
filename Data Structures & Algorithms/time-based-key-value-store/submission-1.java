// class KV{
//     String key;
//     String value; 
// }
class TimeMap {
    HashMap<String,TreeMap<Integer,String>> mp;
    public TimeMap() {
        mp = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer,String> temp;
        if(!mp.containsKey(key)){
            mp.put(key,new TreeMap<>());
        }
        temp = mp.get(key);
        temp.put(timestamp,value);
        mp.put(key,temp);
    }
    
    public String get(String key, int timestamp) {
            TreeMap<Integer, String> temp = mp.get(key);
            if (temp == null) 
                return "";

            Integer floorKey = temp.floorKey(timestamp);
            if (floorKey == null) 
                return "";

            return temp.get(floorKey);
    }
}

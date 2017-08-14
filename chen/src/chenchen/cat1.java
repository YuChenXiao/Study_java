package chenchen;

public class cat1 {
    public static void main(String[] args) {
        // JSON 資料
        String json = "[{\"animal_id\":\"10305240201056\",\"animal_kind\":\"貓\",\"animal_sex\":\"F\",\"shelter_name\":\"臺北市動物之家\"},"
                + "{\"animal_id\":\"10508011005002\",\"animal_kind\":\"狗\",\"animal_sex\":\"F\",\"shelter_name\":\"臺中市中途動物醫院\"}]";

        // cat 物件陣列, 4個欄位
        String[] cat = new String[4];
        // dog 物件陣列, 4個欄位
        String[] dog = new String[4];

        // 去除頭尾 [ ] 符號
        json = json.replace("[","").replace("]","");
        // 取出 cat 資料
        String catData = json.substring(json.indexOf("{"), json.indexOf("}") + 1);
        // 去除頭尾 { } 符號
        String tmp = catData.replace("{","").replace("}","");
        // 切割資料, 存入 cat 陣列
        cat = tmp.split(",");

        // 取出 dog 資料
        String dogData = json.replace(catData +",", "");
        // 去除頭尾 { } 符號
        tmp = dogData.replace("{","").replace("}","");
        // 切割資料, 存入 dog 陣列
        dog = tmp.split(",");

        System.out.println(json);
        // cat JSON資料
        System.out.println(catData);
        // dog JSON資料
        System.out.println(dogData);
        // cat 陣列資料
        System.out.println(cat[3]);
        // cat 陣列資料
        System.out.println(dog[3]);
    }
}
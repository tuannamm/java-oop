package dogmanagement;

import data.Dog;

public class DogManagement {

    public static void main(String[] args) {
        // lấy khuôn Dog ra để bắt đầu đổ info
        // y chang làm thẻ căn cước: lấy thông tin, in lên thẻ, đổ mực
        // sau khi chờ khô, ta được object thuộc nhóm vừa đúc
        // đặt tên gọi tắt cho object để dễ dàng nói chuyện, tham chiếu đến
        
        Dog chiHu = new Dog("Chihuhu", 12, 43);
    // biến/tên tắc         object
    // CaSi ChiPu    {name: NTC; yob: 1993; hits: Anh oi}
    
        // có object thì object sẽ biết làm gì đó, cờ hó biết sủa
        chiHu.bark();
        
        Dog ngaoDa = new Dog("Ngao da", 2020, 50);
        ngaoDa.bark();
        
        int yob = 2001;
        System.out.println("yob: "+ yob);
        yob = 2002;
        System.out.println("yob: "+ yob);
        
        // chiHu sủa tiếp
        System.out.println("Chi hu sủa");
        chiHu.bark();
        
        // bark() ? đứa nào sủa không biết
        // HÀNH ĐỘNG PHẢI GẮN VỚI OBJECT, THÔNG QUA CHẤM
        System.out.println("hello " + chiHu.name);
        
        chiHu.setNewWeight(56);
        
        int chiHuYob = chiHu.getYob();
        System.out.println("chiHu yob: " + chiHuYob);
        System.out.println("ngaoDa yob: "+ ngaoDa.getYob());
        System.out.println("ngaoDa weight: " + ngaoDa.getWeight());
        
        
    }
    
}

// new là xin vùng ram mới đủ chứa info của 1 bạn Dog sẽ được đúc, được đổ vào
// có 2 vùng name dành cho 2 object
// nên ngaoDa không đè lên name của chiHu

// ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG (GÓI TRONG CÁI KHUÔN)
// HÀM BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN, MIÊU TẢ CHO MỘT OBJECT MỘT THỰC THỂ NÀO ĐÓ
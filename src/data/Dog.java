package data;

// Khuôn dùng để đúc ra các object, đối tượng cần lưu trữ info, thứ làm ra để bán
// Khuôn phải kín, có phễu để chế/rót/hứng/đổ vào cái data, nguyên liệu
public class Dog {
    // chứa đặc điểm, chi tiết mà cái khuôn, object tương lai sẽ có
    // khuôn design ra sao, mai mốt object có thể
    public String name;
    private int yob;
    private double weight;
    //...
    // CMND, thẻ căn cước, khác value đổ vào, 
    
    // có khuôn thì phải có phễu để hứng vật liệu đi vào
    // phễu dùng để nhận vật liệu để đúc ra, tạo ra, construct cái object
    // phễu còn gọi là constructor, hàm khởi tạo, hàm đúc, hàm tạo dựng
    // ra object vì thông qua nó như cái phễu vật liệu chạy vào trong khuôn
    // vật liệu khô ra object/bức tượng, cmnd, hồ sơ được tạo ra
    // CONSTRUCTOR (PHỄU) LÀ HÀM CỰC KỲ ĐẶC BIỆT, VÌ NÓ DÙNG ĐỂ TẠO RA OBJECT
    // CỨ MỖI LẦN XÀI NÓ, TỨC LÀ PHẢI ĐƯA NGUYÊN LIỆU VÀO, TỨC LÀ CÓ 1 OBJECT MỚI
    // PHỄU LÀ HÀM ĐẶC BIỆT KHÔNG CÓ GIÁ TRỊ TRẢ VỀ, KHÔNG VOID LUÔN, TRẢ VỀ BỨC TƯỢNG ĐANG ĐÚC
    // TÊN 100% GIỐNG TÊN CỦA CLASS
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }
    
    // viết các hàm xử lý data, ví dụ như giao tiếp nhau để hỏi năm sinh
    // mày hỏi tao trả lời, vì ba má đã fill yob
    // object thì sẽ gọi là hành động, behaviour, xử lý tính toán trên các biến được đổ value từ lúc đúc ra
    
    // hàm gọi n lần tương đương các hành động mà object nào đó lặp đi lặp lại
    // hành động của object gọi n lần trên object đó
    public void bark() {
        System.out.println("Gogogogogogo my name is: " + name);
        System.out.println("Gogogogogogo my yob is: " + yob);
    }
    
    // thay đổi info ba đã cho lúc ba má new/đúc ra mình
    public void setNewWeight(double newWeight ) {
        weight = newWeight;
    }
    
    // vì mặc định info sẽ là giấu, khi mình giao tiếp thì mình mới bật nó ra
    // chia sẻ info khi được hỏi, đó chính là method/hàm/hành động get
    public int getYob() {
        return yob;
    }
    
    public double getWeight() {
        return weight;
    }
    
    
}

// code bên ngoài giống khuôn bị lủng

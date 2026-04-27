package enums;


import lombok.Getter;

@Getter
public enum IsOnline {
    YES("YES"),
    NO("NO");

    private String value;

    IsOnline(String value) {
    }


    // 1. Hàm lấy Enum dựa trên String value (ví dụ: truyền vào "SHIPPING" -> trả về Status.SHIPPING)
    public static IsOnline getByValue(String value) {
        for (IsOnline isOnline : IsOnline.values()) {
            if (isOnline.value.equalsIgnoreCase(value)) {
                return isOnline;
            }
        }
        return null; // Hoặc throw exception nếu không tìm thấy
    }

    // 2. Hàm lấy Enum dựa trên Tên định nghĩa (ví dụ: truyền vào "PENDING" -> trả về Status.PENDING)
    // Thực tế Java có sẵn hàm Status.valueOf("PENDING"), nhưng ta viết lại để an toàn hơn (không phân biệt hoa thường)
    public static IsOnline getByName(String name) {
        for (IsOnline isOnline : IsOnline.values()) {
            if (isOnline.name().equalsIgnoreCase(name)) {
                return isOnline;
            }
        }
        return null;
    }
}

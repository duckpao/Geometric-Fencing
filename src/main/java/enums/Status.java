package enums;

import lombok.Getter;

@Getter
public enum Status {
    SHIPPING("SHIPPING"),
    PENDING("PENDING"),
    COMPLETED("COMPLETED");
    private String value;

    Status(String value) {
    }


    // 1. Hàm lấy Enum dựa trên String value (ví dụ: truyền vào "SHIPPING" -> trả về Status.SHIPPING)
    public static Status getByValue(String value) {
        for (Status status : Status.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        return null; // Hoặc throw exception nếu không tìm thấy
    }

    // 2. Hàm lấy Enum dựa trên Tên định nghĩa (ví dụ: truyền vào "PENDING" -> trả về Status.PENDING)
    // Thực tế Java có sẵn hàm Status.valueOf("PENDING"), nhưng ta viết lại để an toàn hơn (không phân biệt hoa thường)
    public static Status getByName(String name) {
        for (Status status : Status.values()) {
            if (status.name().equalsIgnoreCase(name)) {
                return status;
            }
        }
        return null;
    }


}

package rikkei;

public class CheckTamgiac {
    public static String checkTamGac(double a, double b, double c) {
//        if (a <= 0 || b <= 0 || c <= 0 && a + b <= c && b + c <= a && a + c <= b) {
//            return "sai số liệu đây không phải tam giác";
//        } else if ((a == b) && (b == c)) {
//            return "đây là tam giác đều";
//        } else if ((a == b) || (b == c) || (a == c)) {
//            return "đây là tam giác cân";
//        } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
//            return "đây là tam giác vuông";
//        } else if (((a * a + b * b == c * c) && (a == b)) ||
//                ((a * a + c * c == b * b) && (a == c)) ||
//                ((b * b + c * c == a * a) && (b == c))) {
//            return "đây là tam giác vuông cân";
//        }
//        return "đây là tam giác thường";
//    }
        // Kiểm tra điều kiện lập thành tam giác
        if ((a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
            // Kiểm tra điều các tam giác đặc biệt
            if ((a == b) && (b == c)) {
                return "Tam giác đều!";
            } else if ((a == b) || (a == c) || (b == c)) {
                return "Tam giác cân!";
            } else if ((a * a == b * b + c * c) ||
                    (b * b == a * a + c * c) ||
                    (c * c == a * a + b * b)) {
                return "Tam giác vuông!";
            } else if (Math.abs(b * b - a * a - c * c) < 0.0001 || Math.abs(a * a - b * b - c * c) < 0.0001 || Math.abs(c * c - a * a - b * b) < 0.0001) {
                return "Tam giác vuông cân!";
            } else {
                return "Tam giác thường!";
            }
        } else {
            return "3 cạnh của tam giác không thỏa mãn điều kiện lập thành tam giác!";
        }

    }
}

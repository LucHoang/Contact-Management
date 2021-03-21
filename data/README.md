Cài đặt chức năng
1. Xây dựng chức năng cho phép người dùng hiển thị danh bạ và cho phép người dùng
“thêm”, “sửa”, “ xóa” các mục danh bạ.
Thông tin cần hiển thị:
- Lựa chọn “Thêm mới”.
- Số điện thoại.
- Nhóm.
- Họ tên.
- Giới tính.
- Địa chỉ
Yêu cầu:
- Hiển thị lần lượt 5 mục danh bạ trong bộ nhớ. Đợi người dùng nhấn phím enter để
hiển thị thông tin các mục tiếp theo (đến khi hết thì quay lại menu chính).
2. Xây dựng chức năng thêm một mục danh bạ mới
Thông tin của danh bạ:
- Số điện thoại.
- Nhóm của danh bạ.
- Họ tên.
- Giới tính.
- Địa chỉ
- Ngày sinh.
- Email.
Yêu cầu:
- Kiểm tra lỗi dữ liệu nhập vào trên dòng lệnh và thông báo cho người dùng khi ấn
phím enter. Yêu cầu kiểm tra các lỗi nhập dữ liệu sau:
 Các trường yêu cầu bắt buộc.
 Định dạng số điện thoại và email.
- Nếu dữ liệu hợp lệ sẽ thực hiện thêm dữ liệu vào bộ nhớ và thông báo kết quả cho
người dùng.
3. Xây dựng chức năng cho phép người dùng sửa thông tin một danh bạ. Các bước để
người dùng thực hiện tính năng này như sau:
- Bước 1: Chọn “3. Cập nhật”
- Bước 2: Yêu cầu người dùng nhập vào số điện thoại của danh bạ cần sửa.
- Bước 3: Nếu tìm được số điện thoại danh bạ thì qua bước 4.
Ngược lại, hiển thị thông báo “Không tìm được danh bạ với số điện thoại trên.” và
yêu cầu người dùng nhập lại. Nếu người dùng không nhập gì và nhấn Enter thì thoát
khỏi chức năng, quay về Menu.
Codegym | Advanced Programming with Java 2.0 | Practvaa Finaa Exam 01- Bước 4: Yêu cầu người dùng nhập vào thông tin mới. Các thông tin cho phép sửa
gồm :
 Nhóm của danh bạ.
 Họ tên.
 Giới tính.
 Địa chỉ
 Ngày sinh.
 Email.
Yêu cầu:
- Kiểm tra lỗi dữ liệu nhập vào trên dòng lệnh và thông báo cho người dùng khi ấn
phím enter. Yêu cầu kiểm tra các lỗi nhập dữ liệu sau:
 Các trường yêu cầu bắt buộc.
 Định dạng số điện thoại và email.
- Nếu dữ liệu hợp lệ sẽ thực hiện cập nhật dữ liệu vào bộ nhớ và thông báo kết quả
cho người dùng.
4. Xây dựng chức năng xoá danh bạ. Các bước để người dùng thực hiện tính năng này
như sau:
- Bước 1: Chọn “4. Xoá”
- Bước 2: Yêu cầu người dùng nhập vào số điện thoại của danh bạ muốn xoá.
- Bước 3: Nếu tìm được số điện thoại danh bạ thì qua bước 4.
Ngược lại, hiển thị thông báo “Không tìm được danh bạ với số điện thoại trên.” và
yêu cầu người dùng nhập lại. Nếu người dùng không nhập gì và nhấn Enter thì thoát
khỏi chức năng, quay về Menu.
- Bước 4: Yêu cầu người dùng xác nhận muốn xoá thông tin danh bạ. Nếu người dùng
nhập “Y” thì xoá khỏi bộ nhớ. Nếu người dùng nhập ký tự khác thì thoát khỏi chương
trình và quay về Menu.
5. Xây dựng chức năng tìm kiếm
Yêu cầu cài đặt thêm chức năng tìm kiếm gần đúng theo “Số điện thoại” hoặc “Họ tên” tại
màn hình hiển thị danh sách danh bạ.
6. Xây dựng chức năng đọc danh bạ từ file CSV
Hãy xây dựng tính năng đọc danh bạ từ file csv có sẵn. Đường dẫn mặc định là
“data/contacts.csv”.
Lựa chọn “Đọc từ File” sẽ thực hiện cảnh báo người dùng trước khi cập nhật bộ nhớ (xoá
toàn bộ danh bạ đang có trong bộ nhớ). Nếu người dùng chấp nhận sẽ thực hiện cập nhật lại
toàn bộ bộ nhớ danh bạ từ file.
(Tải file mẫu tại đường link sau: https://github.com/codegym-vn/csv-example)
Codegym | Advanced Programming with Java 2.0 | Practvaa Finaa Exam 01Hướng dẫn: CSV (Comma Separated Values) là một loại định dạng văn bản đơn giản mà
trong đó, các giá trị được ngăn cách với nhau bằng dấu phẩy. Một văn bản CSV gồm nhiều
dòng chứa các giá trị và các dấu phẩy. Dòng đầu tiên của văn bản CSV chứa tên của từng
cột, mỗi cột được xác định bằng 2 dấu phẩy (trừ cột đầu tiên và cuối cùng). Tất cả những
dòng sau đó đều có cấu trúc tương tự, chứa các giá trị tương ứng của từng cột. Và mỗi dòng
của văn bản là một dòng giá trị khác nhau trên bảng tính. (Tham khảo file mẫu để rõ hơn về
nội dung của một file CSV).
7. Xây dựng chức năng lưu danh bạ vào file CSV
Xây dựng tính năng cho phép người dùng ghi các mục danh bạ đang có trong bộ nhớ vào file
với đường dẫn mặc định là “data/contacts.csv”.
Lựa chọn “Lưu vào File” sẽ thực hiện cảnh báo người dùng trước khi cập nhật file danh bạ.
Nếu người dùng chấp nhận sẽ thực hiện cập nhật lại toàn bộ nội dung file.
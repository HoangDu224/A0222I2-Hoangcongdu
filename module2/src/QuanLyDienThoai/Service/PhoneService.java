package QuanLyDienThoai.Service;

import QuanLyDienThoai.Exception.NotFoundException;
import QuanLyDienThoai.Model.Phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneService {
    static List<Phone> phoneList = new ArrayList<>();
    static int id = 1;

    static {
        Phone phone = new Phone(0, "xiaomi", 1000, "xiaomi");
        Phone phone1 = new Phone(0, "samsung", 2000, "samsung");
        phone.setId(id++);
        phone1.setId(id++);
        phoneList.add(phone);
        phoneList.add(phone1);

    }

    public void addPhone(Phone Phone) {
        phoneList.add(Phone);
        phoneList.get(phoneList.size() - 1).setId(id++);
    }

    public List<Phone> findAll() {
        return phoneList;
    }

    public void delete(int Id) throws NotFoundException {
        for (Phone phone : phoneList) {
            if (phone.getId() == Id) {
                phoneList.remove(phone);
                return;
            }
            throw new NotFoundException(Id + " is not exit");
        }
    }

    public List<Phone> searchByName(String name) {
        List<Phone> result = new ArrayList<>();
        for (QuanLyDienThoai.Model.Phone Phone : phoneList) {
            if (Phone.getName().equals(name)) {
                result.add(Phone);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Name not found");
            return Collections.emptyList();
        } else {
            return result;
        }
    }
}

package ss12JavaCollectionFrameWork.BaiTap.LuyenTapSuDungArraylistLindkedList.LinkedListVer;

import ss10ArraylistLinkedList.BaiTap.TrienKhaiLinkedList.LinkedList;
import ss12JavaCollectionFrameWork.BaiTap.LuyenTapSuDungArraylistLindkedList.ArrayListVer.ProductManager;

public class TestLinkedListProduct {
    public static void main(String[] args) {
        LinkedListProductManager product1 = new LinkedListProductManager();
        product1.addProduct("truyen tranh",2,10000);
        product1.addProduct("truyen trinh tham",1,11000);
        product1.addProduct("truyen trinh tham",1,15000);
        product1.addProduct("truyen trinh tham",1,1000);
        product1.sort(true);
        product1.display();
    }
}

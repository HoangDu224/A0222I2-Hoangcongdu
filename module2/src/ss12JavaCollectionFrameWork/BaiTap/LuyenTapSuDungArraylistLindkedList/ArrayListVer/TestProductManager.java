package ss12JavaCollectionFrameWork.BaiTap.LuyenTapSuDungArraylistLindkedList.ArrayListVer;

import ss12JavaCollectionFrameWork.BaiTap.LuyenTapSuDungArraylistLindkedList.ArrayListVer.ProductManager;

public class TestProductManager {
    public static void main(String[] args) {
        ProductManager product1 = new ProductManager();
        product1.addProduct("truyen tranh",2,10000);
        product1.addProduct("truyen trinh tham",1,11000);
        product1.addProduct("truyen trinh tham",1,15000);
        product1.addProduct("truyen trinh tham",1,1000);
        product1.addProduct("truyen trinh tham",1,31000);
        product1.sortGiamDan();
        product1.display();
    }
}

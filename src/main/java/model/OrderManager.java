package model;

import javax.swing.table.DefaultTableModel;

public class OrderManager {
    private final String[] columnNames = {"Nhà Cung Cấp", "Giống Lợn", "Số Lượng", "Tuổi (ngày)", "Giá (VNĐ)", "Tình Trạng Tiêm Chủng"};
    private String[] row = new String[columnNames.length];
    private final String[][] defauleData = {
        {"Bình Minh", "Yorkshire", "100", "15", "700000", "true"},
        {"Rạng Đông", "Duroc", "200", "13", "500000", "true"},
        {"Hoàng Hôn", "Landrace", "300", "14", "650000", "false"},
        {"Chiều Tà", "Móng Cái", "150", "12", "550000", "true"},
        {"Hừng Đông", "Meishan", "250", "16", "700000", "true"}
    };
    private final DefaultTableModel defauleTableModel = new DefaultTableModel(defauleData, columnNames);
    
    public void update(Order order) {
        row[0] = order.getSoure();
        row[1] = order.getType();
        row[2] = order.getQuantity()+"";
        row[3] = order.getAge()+"";
        row[4] = order.getPrice()+"";
        row[5] = order.isVaccinationStatus()+"";
        defauleTableModel.addRow(row);
    }

    public DefaultTableModel getDefauleTableModel() {
        return defauleTableModel;
    }
}
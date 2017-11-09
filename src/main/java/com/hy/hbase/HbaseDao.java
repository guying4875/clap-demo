package com.hy.hbase;

//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.hbase.*;
//import org.apache.hadoop.hbase.client.*;
//import org.apache.hadoop.hbase.util.Bytes;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//
//import java.io.IOException;

/**
 * Created by zhanghy on 17-9-20.
 */
public class HbaseDao {
//    private static Logger logger = LoggerFactory.getLogger(HbaseDao.class);
//    /* create config and connection. */
//    private static Configuration conf = HBaseConfiguration.create();
//    private static Connection connect = null;
//    static {
//        try {
//            Resource resource = new ClassPathResource("hbase/hbase-site.xml");
//            conf.addResource(resource.getInputStream());
//            connect = ConnectionFactory.createConnection(conf);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//    public static void  main (String [] agrs) throws Exception {
//
//        try {
//            /* create table. */
////            String tableName = "student";
////            String[] family = { "info", "sort" };
////            createTable(tableName, family);
//
//            /**修改表信息***/
////              alterTable("student","info",1,4);
//
//              //查看表中列信息
////            describeTable("student","info");
////            /* put data. */
////            String[] column1 = { "title", "content", "tag" };
////            String[] value1 = {
////                    "Head First HBase",
////                    "HBase is the Hadoop database. Use it when you need random, realtime read/write access to your Big Data.",
////                    "Hadoop,HBase,NoSQL" };
////            String[] column2 = { "name", "nickname" };
////            String[] value2 = { "nicholas", "lee" };
//            addData("student","s001","info","age","3");
////            addData("rowkey2", tableName, column1, value1, column2, value2);
////            addData("rowkey3", tableName, column1, value1, column2, value2);
////
////            /* scan query. */
////            getResultScan("student", "s001", "s001");
////
////            /* range scan query. */
////            getResultScan(tableName, "rowkey4", "rowkey5");
////
////            /* get data. */
////            getResult("student", "s001");
////
////            /* get column data. */
////            getResultByColumn("student", "s001", "info", "name");
////
////            /* update column data. */
////            updateTable(tableName, "rowkey1", family[1], "name", "bin");
////
////            /* get column data. */
////            getResultByColumn(tableName, "rowkey1", family[1], "name");
////
////            /* get multi-version data. */
////            getResultByVersion("student", "s001", "info", "name");
////
////            /* delete column.*/
////            deleteColumn(tableName, "rowkey1", family[1], "nickname");
////
////            /* delete row. */
////            deleteAllColumn(tableName, "rowkey1");
////
////            /* delete table. */
////            deleteTable("student");
////            listTable();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 查看所有表名
//     * @throws IOException
//     */
//    public static void listTable() throws IOException {
//        Admin admin = connect.getAdmin();
//        TableName[] tableNames = admin.listTableNames();
//        if (tableNames != null && tableNames.length >0){
//            for (TableName tableName : tableNames) {
//                System.out.print(tableName.getNameAsString());
//
//            }
//        }
//    }
//
//
//    /**
//     * 创建表
//     * @param tableName 表名
//     * @param family 列族
//     * @throws Exception
//     */
//    public static boolean createTable(String tableName, String[] family)
//            throws Exception {
//        Admin admin = connect.getAdmin();
//        TableName tn = TableName.valueOf(tableName);
//        HTableDescriptor desc = new HTableDescriptor(tn);
//        for (int i = 0; i < family.length; i++) {
//            desc.addFamily(new HColumnDescriptor(family[i]));
//        }
//
//        if (admin.tableExists(tn)) {
//            logger.info("table Exists!");
//            return false;
//        } else {
//            admin.createTable(desc);
//            logger.info("create table Success!");
//            return true;
//        }
//    }
//
//    /**
//     * 修改表中列族的versions属性
//     * @param tableName 表名
//     * @param familyName 列族
//     * @param minVersions 最小版本
//     * @param maxVersions 最大版本
//     * @return
//     * @throws IOException
//     */
//    public static boolean alterTable(String tableName,String familyName,int minVersions,int maxVersions) throws IOException {
//        Admin admin = connect.getAdmin();
//        TableName tn = TableName.valueOf(tableName);
//        HTableDescriptor desc = admin.getTableDescriptor(tn);
//        HColumnDescriptor columnDescriptor = new HColumnDescriptor(familyName);
//        columnDescriptor.setVersions(minVersions,maxVersions);
//        desc.modifyFamily(columnDescriptor);
//        admin.disableTable(tn);
//        admin.modifyTable(tn,desc);
//        admin.enableTable(tn);
//        logger.info("表修改完成");
//        return true;
//    }
//
//    /**
//     * 获取表中指定列族的属性
//     * @param tableName
//     * @param famile
//     * @throws IOException
//     */
//    public static void describeTable(String tableName,String famile) throws IOException {
//        Admin admin = connect.getAdmin();
//        TableName tn = TableName.valueOf(tableName);
//        HTableDescriptor tableDescriptor = admin.getTableDescriptor(tn);
//        HColumnDescriptor column = tableDescriptor.getFamily(Bytes.toBytes(famile));
//        System.out.println("列名为："+Bytes.toString(column.getName()));
//        System.out.print("maxversion："+column.getMaxVersions());
//    }
//
//    /**
//     * 添加数据
//     * @param tableName
//     * @param rowKey
//     * @param family
//     * @param column
//     * @param value
//     * @throws IOException
//     */
//    public static void addData(String tableName,String rowKey,String family,String column,String value)
//            throws IOException {
//        /* get table. */
//        TableName tn = TableName.valueOf(tableName);
//        Table table = connect.getTable(tn);
//
//        /* create put. */
//        Put put = new Put(Bytes.toBytes(rowKey));
//        put.addColumn(Bytes.toBytes(family),Bytes.toBytes(column),Bytes.toBytes(value));
//        /* put data. */
//        table.put(put);
//        logger.info("add data Success!");
//    }
//
//    /**
//     * 添加数据
//     * @param rowKey
//     * @param tableName 表名
//     * @param column1 列名
//     * @param value1 值
//     * @param column2 列明
//     * @param value2 值
//     * @throws IOException
//     */
//    public static void addData(String rowKey, String tableName,
//                               String[] column1, String[] value1, String[] column2, String[] value2)
//            throws IOException {
//        /* get table. */
//        TableName tn = TableName.valueOf(tableName);
//        Table table = connect.getTable(tn);
//
//        /* create put. */
//        Put put = new Put(Bytes.toBytes(rowKey));
//        HColumnDescriptor[] columnFamilies = table.getTableDescriptor().getColumnFamilies();
//
//        for (int i = 0; i < columnFamilies.length; i++) {
//            String f = columnFamilies[i].getNameAsString();
//            if (f.equals("article")) {
//                for (int j = 0; j < column1.length; j++) {
//                    put.addColumn(Bytes.toBytes(f), Bytes.toBytes(column1[j]), Bytes.toBytes(value1[j]));
//                }
//            }
//            if (f.equals("author")) {
//                for (int j = 0; j < column2.length; j++) {
//                    put.addColumn(Bytes.toBytes(f), Bytes.toBytes(column2[j]), Bytes.toBytes(value2[j]));
//                }
//            }
//        }
//
//        /* put data. */
//        table.put(put);
//        logger.info("add data Success!");
//    }
//
//    /**
//     * 查询数据
//     * @param tableName 表名
//     * @param rowKey
//     * @throws IOException
//     */
//    public static void getResult(String tableName, String rowKey)
//            throws IOException {
//        /* get table. */
//        Table table = connect.getTable(TableName.valueOf(tableName));
//
//        Get get = new Get(Bytes.toBytes(rowKey));
//
//        Result result = table.get(get);
//        for (Cell cell : result.listCells()) {
//            System.out.println("------------------------------------");
//            System.out.println("rowkey: " + new String(CellUtil.cloneRow(cell)));
//            System.out.println("family: " + new String(CellUtil.cloneFamily(cell)));
//            System.out.println("column: " + new String(CellUtil.cloneQualifier(cell)));
//            System.out.println("value : " + new String(CellUtil.cloneValue(cell)));
//            System.out.println("timest: " + cell.getTimestamp());
//        }
//    }
//
//    public static void getResult(String tableName) throws IOException {
//        Table table = connect.getTable(TableName.valueOf(tableName));
////        Get get = new Get(Bytes.toBytes(rowKey));
//    }
//
//    /**
//     * 查看表中所有数据
//     * @param tableName
//     * @throws IOException
//     */
//    public static void getResultScan(String tableName) throws IOException {
//        Scan scan = new Scan();
//        ResultScanner rs = null;
//        Table table = connect.getTable(TableName.valueOf(tableName));
//        try {
//            rs = table.getScanner(scan);
//            for (Result r : rs) {
//                for (Cell cell : r.listCells()) {
//                    System.out.println("------------------------------------");
//                    System.out.println("rowkey: " + new String(CellUtil.cloneRow(cell)));
//                    System.out.println("family: " + new String(CellUtil.cloneFamily(cell)));
//                    System.out.println("column: " + new String(CellUtil.cloneQualifier(cell)));
//                    System.out.println("value : " + new String(CellUtil.cloneValue(cell)));
//                    System.out.println("timest: " + cell.getTimestamp());
//                }
//            }
//        } finally {
//            rs.close();
//        }
//    }
//
//    /**
//     * 查询指定列中数据，从startRowKey开始到stopRowkey结束行
//     * @param tableName
//     * @param startRowkey
//     * @param stopRowkey
//     * @throws IOException
//     */
//    public static void getResultScan(String tableName, String startRowkey,
//                                     String stopRowkey) throws IOException {
//        Scan scan = new Scan();
//        scan.setStartRow(Bytes.toBytes(startRowkey));
//        scan.setStopRow(Bytes.toBytes(stopRowkey));
//        ResultScanner rs = null;
//        Table table = connect.getTable(TableName.valueOf(tableName));
//        try {
//            rs = table.getScanner(scan);
//            for (Result r : rs) {
//                for (Cell cell : r.listCells()) {
//                    System.out.println("------------------------------------");
//                    System.out.println("rowkey: " + new String(CellUtil.cloneRow(cell)));
//                    System.out.println("family: " + new String(CellUtil.cloneFamily(cell)));
//                    System.out.println("column: " + new String(CellUtil.cloneQualifier(cell)));
//                    System.out.println("value : " + new String(CellUtil.cloneValue(cell)));
//                    System.out.println("timest: " + cell.getTimestamp());
//                }
//            }
//        } finally {
//            rs.close();
//        }
//    }
//
//    /**
//     * 获取指定列信息
//     * @param tableName
//     * @param rowKey
//     * @param familyName
//     * @param columnName
//     * @throws IOException
//     */
//    public static void getResultByColumn(String tableName, String rowKey,
//                                         String familyName, String columnName) throws IOException {
//        /* get table. */
//        Table table = connect.getTable(TableName.valueOf(tableName));
//        Get get = new Get(Bytes.toBytes(rowKey));
//        get.addColumn(Bytes.toBytes(familyName), Bytes.toBytes(columnName)); // 获取指定列族和列修饰符对应的列
//        Result result = table.get(get);
//
//        for (Cell cell : result.listCells()) {
//            System.out.println("------------------------------------");
//            System.out.println("rowkey: " + new String(CellUtil.cloneRow(cell)));
//            System.out.println("family: " + new String(CellUtil.cloneFamily(cell)));
//            System.out.println("column: " + new String(CellUtil.cloneQualifier(cell)));
//            System.out.println("value : " + new String(CellUtil.cloneValue(cell)));
//            System.out.println("timest: " + cell.getTimestamp());
//        }
//    }
//
//    /**
//     * 更新列信息
//     * @param tableName
//     * @param rowKey
//     * @param familyName
//     * @param columnName
//     * @param value
//     * @throws IOException
//     */
//    public static void updateTable(String tableName, String rowKey,
//                                   String familyName, String columnName, String value)
//            throws IOException {
//        Table table = connect.getTable(TableName.valueOf(tableName));
//        Put put = new Put(Bytes.toBytes(rowKey));
//        put.addColumn(Bytes.toBytes(familyName), Bytes.toBytes(columnName),
//                Bytes.toBytes(value));
//        table.put(put);
//        System.out.println("update table Success!");
//    }
//
//    /**
//     * 获取指定列中多版本数据
//     * @param tableName
//     * @param rowKey
//     * @param familyName
//     * @param columnName
//     * @throws IOException
//     */
//    public static void getResultByVersion(String tableName, String rowKey,
//                                          String familyName, String columnName) throws IOException {
//        Table table = connect.getTable(TableName.valueOf(tableName));
//        Get get = new Get(Bytes.toBytes(rowKey));
//        get.addColumn(Bytes.toBytes(familyName), Bytes.toBytes(columnName));
//        get.setMaxVersions(5);
//        Result result = table.get(get);
//        for (Cell cell : result.listCells()) {
//            System.out.println("------------------------------------");
//            System.out.println("timest: " + cell.getSequenceId());
//            System.out.println("rowkey: " + new String(CellUtil.cloneRow(cell)));
//            System.out.println("family: " + new String(CellUtil.cloneFamily(cell)));
//            System.out.println("column: " + new String(CellUtil.cloneQualifier(cell)));
//            System.out.println("value : " + new String(CellUtil.cloneValue(cell)));
//            System.out.println("timest: " + cell.getTimestamp());
//        }
//    }
//
//    /**
//     * 删除指定列内容
//     * @param tableName
//     * @param rowKey
//     * @param falilyName
//     * @param columnName
//     * @throws IOException
//     */
//    public static void deleteColumn(String tableName, String rowKey,
//                                    String falilyName, String columnName) throws IOException {
//        Table table = connect.getTable(TableName.valueOf(tableName));
//        Delete deleteColumn = new Delete(Bytes.toBytes(rowKey));
//        deleteColumn.addColumns(Bytes.toBytes(falilyName), Bytes.toBytes(columnName));
//        table.delete(deleteColumn);
//        System.out.println(falilyName + ":" + columnName + "is deleted!");
//    }
//
//    /**
//     * 删除行记录
//     * @param tableName
//     * @param rowKey
//     * @throws IOException
//     */
//    public static void deleteAllColumn(String tableName, String rowKey)
//            throws IOException {
//        Table table = connect.getTable(TableName.valueOf(tableName));
//        Delete deleteAll = new Delete(Bytes.toBytes(rowKey));
//        table.delete(deleteAll);
//        System.out.println("all columns are deleted!");
//    }
//
//    /**
//     * 删除表
//     * @param tableName
//     * @throws IOException
//     */
//    public static void deleteTable(String tableName) throws IOException {
//        Admin admin = connect.getAdmin();
//        admin.disableTable(TableName.valueOf(tableName));
//        admin.deleteTable(TableName.valueOf(tableName));
//        System.out.println(tableName + "is deleted!");
//    }


}

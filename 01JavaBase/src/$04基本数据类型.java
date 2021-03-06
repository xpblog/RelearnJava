public class $04基本数据类型 { // **切记此处的Java类名，命名十分不规范，但是为了方便阅读所以才这样命名**

    /**
     * Java基本数据类型
     *
     * 在Java中基本的数据类型是"四类八种"
     *  ● 整型   - byte、short、int、long
     *  ● 浮点型 - float、double
     *  ● 字符型 - char
     *  ● 布尔型 - boolean
     */


    // byte整型
    // 占内存：1字节(8位)，在内存中用用8个可以放0/1的"小格子"来存
    // 范围：可表示的范围是-128～127
    byte b = 127;


    // short整型
    // 占内存：2字节(16位)，在内存中用用16个可以放0/1的"小格子"来存
    // 范围：可表示的范围是正负3万多
    short s = 100;


    // int整型
    // 占内存：4字节(32位)，在内存中用用32个可以放0/1的"小格子"来存
    // 范围：可表示的范围是正负21个亿
    int i = 1024;


    // long整型
    // 占内存：8字节(64位)，在内存中用用64个可以放0/1的"小格子"来存
    // 范围：可表示的数长度有19位
    // * 当表示long型数时，我们需要在数末尾加上l/L(英文L，大小写均可)
    // * 但是，正如你看到的那样，l容易和数字1混淆，所以我们一般都加大写的L
    long l1 = 111111111111111111L;
    long l2 = 111111111111111111l;


    /************************************************
     *
     * 思考：
     *   现在有这样一个需求，我表示的数如果超过了long的范围
     *   你有什么解决方案？请自行查资料找出答案
     *
     *   最好的学习模式是自学-总结，冲冲冲
     *
     ***********************************************/
}

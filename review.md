# 第 2 章 基本程序设计

## 输入

```java
import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input: ");
        String content = input.nextLine();
        System.out.println("This is what you input:");
        System.out.println(content);
        input.close();
    }
}
```

导入java.util.Scanner，使用 `Scanner input = new Scanner(System.in);`通过nextTYPE方法获取输入。

## 标识符

- 由$、字母、_、数字组成
- 不能以数字开头
- 可以为任意长度
- 区分大小写
- 尽量不使用$命名

## 赋值

可以采用链式赋值（C也支持）

```java
int x, y, z;
x = y = z = 1;
```

## 获取时间

```
System.currentTimeMillis()
```

返回一个long类型数，表示GMT时间戳毫秒数

```
System.nanoTime()
```

返回值为纳秒单位

## 数值转换

与C一致

```java
a = (int) b;
```

# 第 3 章 选择

## 产生随机数

```
Math.random()
```

获得一个0.0~1.0之间的随机double值

## switch表达式

支持类型：char、byte、short、int、String。

case必须为常量表达式

# 第 4 章 数字函数、字符和字符串

## 常用数学函数（Math 类）

### 三角函数

| 方法        | 描述       |
| ----------- | ---------- |
| sin()       | 使用弧度制 |
| cos()       |            |
| tan()       |            |
| toRadians() | 以度转弧度 |
| toDegrees() | 弧度转以度 |
| asin()      | 反三角函数 |
| acos()      |            |
| atan()      |            |

### 指对函数

| 方法    | 描述     |
| ------- | -------- |
| exp()   | e的x次方 |
| log()   | ln()     |
| log10() | lg()     |
| pow()   | a的b次方 |
| sqrt()  | 平方根   |

### 舍入方法

| 方法    | 描述       |
| ------- | ---------- |
| ceil()  | 向上取整   |
| floor() | 向下取整   |
| rint()  | 向偶数舍入 |
| round() | 四舍五入   |

### 最值与绝对值

| 方法  | 描述   |
| ----- | ------ |
| max() | 类泛型 |
| min() |        |
| abs() |        |

### 随机数

| 方法     | 描述                  |
| -------- | --------------------- |
| random() | 返回0.0~1.0随机double |

## 字符及字符操作

Java使用Unicode

### 转义表

| 转义序列 | 名称   | 十进制 |
| -------- | ------ | ------ |
| \b       | 退格   | 8      |
| \t       | 制表符 | 9      |
| \n       | 换行符 | 10     |
| \f       | 换页符 | 12     |
| \r       | 回车符 | 13     |
| \\\      | 反斜杠 | 92     |
| \\"      | 双引号 | 34     |

### Character类中的方法

| 方法                | 描述 |
| ------------------- | ---- |
| isDigit(ch)         |      |
| isLetter(ch)        |      |
| isLetterOrDigit(ch) |      |
| isLowwerCase(ch)    |      |
| isUpperCase(ch)     |      |
| toLowerCase(ch)     |      |
| toUpperCase(ch)     |      |

### String方法

| 方法          | 描述                               |
| ------------- | ---------------------------------- |
| length()      | 返回字符数                         |
| charAt(index) | 返回指定位置字符                   |
| concat(s1)    | 将该字符与s1连接，返回一个新字符串 |
| toUpperCase() | 全大写                             |
| toLowerCase() | 全小写                             |
| trim()        | 返回删掉两边空白字符的新字符串     |

### 字符串比较

| 方法                    | 描述                          |
| ----------------------- | ----------------------------- |
| equals(s1)              |                               |
| equalsIgnoreCase(s1)    |                               |
| compareTo(s1)           | 返回大于0、等于0或小于0的整数 |
| compareToIgnoreCase(s1) |                               |
| startsWith(prefix)      |                               |
| endWith(suffix)         |                               |
| contains(s1)            | 判断s1是否为子字符串          |

### 获得自字符串

| 方法                            | 描述                     |
| ------------------------------- | ------------------------ |
| substring(beginIndex)           | 从begin开始到结束        |
| substring(beginIndex, endIndex) | 到endIndex前一个字符结束 |

### 查找字符或子串

| 方法                       | 描述                               |
| -------------------------- | ---------------------------------- |
| indexOf(ch)                | 返回低一个ch的下标（没有返回-1）   |
| indexOf(ch, fromIndex)     | 在fromIndex之后找（包括fromIndex） |
| indexOf(s)                 | 找字符串                           |
| indexOf(s, fromIndex)      |                                    |
| lastIndexOf(ch)            | 找最后一个                         |
| lastIndexOf(ch, fromIndex) | 在fromIndex之前最后一个            |
| lastIndexOf(s)             | 找字符串                           |
| lastIndexOf(s, fromIndex)  |                                    |

### 字符与数值间转换

| 方法                             | 描述        |
| -------------------------------- | ----------- |
| Integer.parseInt(intString)      | str->int    |
| Double.parseDouble(doubleString) | str->double |
| others + ""                      | others->str |

### 更多

第 10 章 面向对象：String 类

# 第 7 章 一维数组

推荐声明风格：

```java
elementTpye[] arrayRefVar;
```

数组元素会被赋予默认值（0、'\u0000'、false）。

## 复制数组

```java
System.arraycopy(sourceArray, srcPos, targetArray, tarPos, length);
```

参数srcPos与tarPos表示复制起始位置，length表示复制长度。

还有：

- for循环复制
- Arrays.copyOf()、Arrays.copyOfRange()
- .clone()方法

## 匿名数组

```java
new elementType[]{value0, value1, ..., valuek};
```

# 第 9 章 对象和类

## UML图

符号+表示public修饰符

## 初始化

类数据域

引用型：null

0、false、'\u0000'。

方法中的局部变量没有默认初始值。

## Java 库中的类

### Date 类

```java
Date() // 根据当前时间创建
Date(elapseTime: long) // 根据格林威治时间（单位毫秒）创建

toString(): String // 返回一个表示日期时间的字符串
getTime(): long // 返回格林威治时间（单位毫秒）
setTime(elapseTime: long): void // 设置一个新的流逝时间
```

### Random 类

```java
Random() // 使用当前时间为种子
Random(seed: long) // 制定种子

nextInt(): int // 随机int
nestInt(n: int): int // 0～n（不包括n）之间随机值
nextLong(): long // 随机long
nextDouble(): double //  0.0～1.0（不包括1.0）之间随机double
nextFloat(): float // 0.0～1.0（不包括1.0）之间随机float
nextBoolean(): boolean // 随机boolean
```

### Point3D 类

```java
Point2D(x: double, y: double) // 给定x和y坐标

distance(x: double, y: double): double // 返回与(x, y)距离
distance(p: Point2D) // 返回与p距离
getX(): double // x坐标
getY(): double // y坐标
midpoint(p: Point2D): Point2D // 与p中点
toString(): String // 转为字符串
```

# 第 10 章 面向对象

## 包装类型

- 构造方法：`Integer(value)`已过时，`Integer.valueOf(value)`通过字符串或数值进行构造
- 导出：`[类型]Value()`方法，如 `a.intValue()`。
- 类型：Byte、Short、Integer、Long与Float、Double。
- 表示范围：`MAX_VALUE`与 `MIN_VALUE`方法（max表示最大值，min表示最小值或最小正值（对于浮点数））
- 比较方法：`compareTo()`：大于、等于、小于，返回1、0、-1。
- 自动转换：根据上下文环境，自动“装箱”、“拆箱”，进行包装类型和基本类型之间的转换。

## BigInteger与BigDecimal

任意精度整数、实数运算。

- 构造方法：`BigInteger(str)`，BigDecimal可以用double构造，但会因精度问题造成奇怪现象：0.1 -> 0.10000...00001231231
- 运算：add、substract、multiple、divide、remainder

BigDecimal可以达到任意精度，无法终止时，divide方法报 `ArithmeticException`，需使用 `divide(BigDecimal d, int scale, int roundingMod)`方法指定精度和舍入方法。

```java
        BigDecimal bigDecimal1 = new BigDecimal("3.0");
        BigDecimal bigDecimal2 = new BigDecimal(9);
        BigDecimal bigDecimal3 = bigDecimal1.divide(bigDecimal2, 100, RoundingMode.HALF_EVEN); 
        System.out.println(bigDecimal3);
```

## String 类

String是不可变的。字符串一旦创建，其内容就不可改变。

### 替换和拆分字符串

```java
replace(oldChar: char, newChar: char): String // 替换匹配的字符
replaceFirst(oldString: String, newString: String): String // 替换第一个匹配的字符串
replaceAll(oldString: String, newString: String): String // 替换所有匹配的字符串
split(delimiter: String): String[] // 返回一个字符串数组（分割字符串）
```

### 使用模式匹配、替换和拆分

正则表达式匹配：`str.matches("正则表达式")`，返回布尔值。

正则替换： `s1 = s2.replaceAll("正则表达式", "替换内容")`。

拆分：`str.split("正则表达式")`，通过正则表达式匹配分隔符。

### 字符串、数组转换

字符串 -> 数组：

- `str.toCharArray()`转换成数组
- `str.getChars(int srcBegin, int scEnd, char[]dst, int dstBegin)`将下表从srcBegin到srcEnd-1的字串复制到dst从下表dstBegin开始的位置。

数组 -> 字符串：

- 构造方法： `new String(char[])`
- valueOf方法： `String.valueOf(char[])`

### 常用静态方法

`valueOf(value)`方法：将字符、数值转换为字符串

format方法：格式化字符串，如 `String.format("%7.2f %6d %-4s", 45.556, 14, "AB")`

## StringBuilder 与 StringBuffer

可变的String

StringBuffer是多线程安全的（修改缓冲区的方法是同步的），但StringBuilder在单线程环境性能更高。

StringBuilder方法：

```java
StringBuiler() // 构建，容量为16
StringBuiler(capacity: int) // 指定容量
StringBuiler(s: String) // 从指定字符串构建

append(data: char[]): StringBuilder // 追加char数组
append(data: char[], offset: int, len: int): StringBuilder // 追加data的子数组
append(v: aPrimitiveType): StringBuilder // 追加基本类型
append(s: String): StringBuilder // 追加字符串

delete(startIndex: int, endIndex: int): StringBuilder // 删除从startIndex到endIndex-1的字符
deleteCharAt(index: int): StringBuilder // 删除此下标字符

insert(index: int, data: char[], offset: int, len:int): StringBuilder // 插入data的子数组
insert(offset: int, data: char[]): StringBuilder // 在offset位置插入data
insert(offset: int, b: aPrimitiveType): StringBuilder // 插入基本类型
insert(offset: int, s: String): StringBuilder // 插入字符串

replace(startIndex: int, endIndex: int, s: String): StringBuilder // 将startIndex到endIndex-1位置的字符替换为给定字符串
reverse(): StringBuilder // 倒置
setCharAt(index: int, ch: char): void // 指定下标替换为新字符
```

返回值StringBuilder是对当前对象的引用

```java
toString(): String // 返回String对象
capacity(): int // 容量
chatAt(): char
length(): int // 返回字符数
setLength(newLength: int): void // 截断或填充空字符（'\u0000'）
subString(startIndex: int): String // 从startIndex开始的子字符串
subStrign(startIndex: int, endIndex: int): String
trimToSize(): void // 缩减capacity到实际大小
```

# 第 11 章 继承和多态

父类：超类、基类

子类：继承类、派生类

父、子类的类型：父类型、子类型

## 对象转换

子类 -> 父类：向上转换

父类 -> 子类：向下转换（必须显式使用转换标记，可以使用instanceof判断）

## Object类方法

- toString()
- equals()

重写时注意必要的向下转换（参数为Object）

## ArrayList 类

位置：java.util

用于储存一个对象的列表。

```java
ArrayList() // 创建空列表

add(e: E): void // 末尾增加e
add(index: int, e: E): void // 指定下标插入
clear(): void // 清空列表
contains(o: Object): boolean // 是否包含o
get(index: int): E // 返回指定下标元素
indexOf(o: Objext): int // 返回第一个匹配元素的下标
isEmpty(): boolean // 判断是否为空
lastIndeOf(o: Object): boolean
remove(o: Object): boolean // 去除最后一个元素，被去除返回true
size(): int // 元素数
remove(index: int): E // 去除下标位置元素，成功返回被去除的元素
set(index:int, e:E): E // 设置下标位置元素
```

# 第 12 章 异常处理和文本I/O

## 异常

### 异常类型

- 系统错误（System Error）
  由Java虚拟机抛出，用Error表示。（内部系统错误）
  - `LinkageError`	一个类依赖于另一个类，但是在编译前者后，后者进行了修改，出现不兼容
  - `VirtualMachineError`	Java虚拟机崩溃（或资源耗尽）
- 异常（Exception）
  由程序和外部环境引起的错误，能被程序捕获和处理。
  - `ClassNotFoundException`	试图使用不存在的类
  - `IOException`	输入输出操作错误
- 运行时异常（Runtime Exception）
  程序设计错误，通常表明编程错误。
  - `ArithmeticException`	整数除以0
  - `NullPointerException`	试图通过null引用访问对象
  - `IndexOutOfBoundsException`	数组越界
  - `IllegalArgumentException`	参数不合法

分类：

- 免检异常
  RuntimeException、Error以及他们的子类。
- 必检异常
  除了免检异常，其他所有异常。（编译器会在编译时强制检查）

### 声明异常

对抛出异常的方法进行声明

Java不要求在方法中显式声明免检异常。其它异常须显式声明。

```java
public void myMethod() throws IOException {
    // ...
    throws new IOException();
}
```

抛出多个异常，可使用 `throws Exception1, Excaptions2, ..., ExceptionN`

### 从异常中获取信息

对于Throwable

```java
getMessage(): String // 返回异常对象信息
toString(): String // 返回字符串：异常类全名+": "+getMessage()
printStackTrace(): void // 打印Throwable对象及其调用栈的跟踪信息
getStackTrace(): StackTraceElement[] // 返回一个栈跟踪元素的数组，表示相关栈跟踪信息
```

### 重新抛出异常

```java
try{
  // statements;
} catch (TheException ex) {
  // perform operations before exits;
  throw ex;
}
```

将异常重新抛出给调用者，以便调用者再处理。

### 创建自定义异常类

尽量使用自带异常类

继承`Exception`类创建自定义异常类。

## 文本I/O

### File 类

```java
File(pathname: String) // 为一个指定的路径名创建一个File对象（目录或文件）
File(parent: String, child: String) // 在parent下创建一个子路径的File对象
File(parent: File, child: String) // parent为File对象

exists(): boolean // 文件/目录是否存在
canRead(): boolean // 文件是否存在且可读
canWrite(): boolean // 文件是否存在且可写
isDirectory(): boolean // 是否为目录
isFile(): boolean
isAbsolute(): boolean // 是否为绝对路径
isHidden(): boolean // 是否是隐藏的

getAbsolutePath(): String // 返回文件或目录的绝对路径名
getCanonicalPath(): String // 同getAbsolutePath，除去冗余的名字（".."、"."）、解析符号链接，盘符转为标准大写。
getName(): String // 返回文件或目录名，如new File("c:\\book\\test.dat").getName() -> "test.dat"
getPath(): String // 返回完整文件或目录名
getParent(): String // 返回当前文件或目录的完整父目录

lastModified(): long // 最后修改时间
length(): long // 返回文件大小，不存在或为目录返回0
listFile(): File[] // 返回目录下的文件
delete(): boolean // 删除File对象所代表的文件或目录，成功返回true
renameTo(dest: File): boolean // 重命名为dest中指定的名字，成功返回true
mkdir(): boolean // 创建file所指的文件夹，成功返回true
mkdirs(): boolean // 同mkdir()，父目录不存在时创建父目录
```

### 文件输入和输出

#### PrintWriter

位置：java.io

- 初始化：使用目录名或File对象
- 方法：
  - `print(value)`	打印String、char、char[]、int、long、float、double、boolean
  - `close()`	关闭文件
- 异常：构造方法可能会抛出IO异常，Java强制要求处理

#### 自动关闭资源

```java
try(/*声明和创建资源*/) {
    // 使用资源来处理文件
}
```

注意：

- 必须在 `try(...)`子句中统一声明资源引用变量和创建资源
- `try(...)`子句最后一句分号可省略
- `try(...)`子句中可以创建多个资源
- `try(...)`子句仅含创建资源的语句

#### Scanner

位置：java.util

- 初始化：File对象或字符串（作为字符串流）
- 方法：
  - `hasNext()`	是否有更多数据可读
  - `next()`	读取下一个标记作为字符串返回
  - `next[类型]()`	读取下一个标记作为[类型]返回，支持byte、short、int、long、float、double
  - `nextLine()`	读取下一行，以换行结束
  - `useDelimiter(pattern: String): Scanner`	设置Scanner的分隔符模式，并返回Scanner
- 异常：以File为对象声明可能会抛出IO异常
- 分隔符：默认为" "，可更改

注意：Windows行分隔符是"\r\n"，UNIX平台则为"\n"

#### 从Web上读取数据

使用java.net.URL类的构造方法创建URL对象

// 书上这里写的方法太老了，在Java20中被弃用了。

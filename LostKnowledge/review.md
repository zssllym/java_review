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

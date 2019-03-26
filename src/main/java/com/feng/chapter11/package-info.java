/**
 * @author jinx
 * @date 2018/5/16 15:35
 * Desc:如果一个程序只包含固定数量的且生命周期都是已知的对象，那么这是一个非常简单的程序。
 *      1.collection:一个独立的元素序列，这些元素都服从一条或多条规则。
 *      2.map:一组成对的“键值对”对象，允许你使用键来查找值。
 *      3.map:某种意义上他将数字与对象关联在了一起。
 *      4.treeSet:按照比较结果的升序保存结果。
 *      5.linkHashSet:按照添加顺序保存对象。
 *      对subList()的操作都会反映到初始列表上，反之亦然。
 *      6.迭代器设计模式
 *      7.迭代器只能向前移动
 *      8.迭代器将遍历序列的操作与序列底层的结构分离，正由如此，我们说迭代器统一了对容器的访问方式。
 *      9.ListIterator可以向前遍历也可以向后遍历。
 *      10.1.LinkList的getFirst()和element()方法都返回列表的第一个元素但在集合为空时抛出NoSuchElementException异常，而peek()方法当列表为空时则返回null。
 *      10.2.remove()和removeAll()一样移除并返回列表的头，而在列表为空时抛出NoSuchElementException异常，而pop()方法在列表为空时返回null。
 *      11.TreeSet将元素存在红黑树数据结构中，而HashSet使用的是散列函数。
 *      12.Queue:off()方法将一个元素插入队尾，peek()和element()在不移除元素的情况下返回队头，peek()返回null element()方法则抛出异常，poll()和remove()移除并返回队头，但poll()当队列为空时返回
 *         null而remove()方法则抛出异常。
 *      13.PriorityQueue:优先级队列。
 *      14.容器不能持有基本类型，但是自动包装机制会仔细的执行基本类型到容器所持有的包装类型之间的双向转换。
 *      15.如果我们编写的方法接受一个Collection，那么该方法就可以应用于任何实现了Collection的类-这也就使得一个新类可以选择去实现Collection接口，以便我的方法可以使用它。
 *      16.各种Queue及栈的行为由LinkedList提供支持。
 *      17.Map和Collection之间唯一的重叠就是Map可以使用entrySet()和values()方法来产生Collection。
 *      18.容器类库一直以来都是设计难题，你应该从中看到中庸之道。
 *
 */
package com.feng.chapter11;
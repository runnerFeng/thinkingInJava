/**
 * @author jinx
 * @date 2018/5/16 15:35
 * Desc:如果一个程序只包含固定数量的且生命周期都是已知的对象，那么这是一个非常简单的程序。
 *      1.collection:一个独立的元素序列，这些元素都服从一条或多条规则。
 *      2.map:一组成对的“键值对”对象，允许你使用键来查找值。
 *      3.map:某种意义上他将数字与对象关联在了一起。
 *      4.treeSet:按照比较结果的升序保存结果。
 *      5.linkHashSet:按照添加顺序保存对象。
 *      6.迭代器设计模式
 *      7.foreach向前遍历，迭代器顺序遍历
 *      8.迭代器将遍历序列的操作与序列底层的结构分离，正由如此，我们说迭代器统一了对容器的访问方式。
 *      9.ListIterator可以向前遍历也可以向后遍历。
 *      10.1.LinkList的getFirst()和element()方法都返回列表的第一个元素但在集合为空时抛出NoSuchElementException异常，而peek()方法当列表为空时则返回null。
 *      10.2.remove()和removeAll()一样移除并返回列表的头，而在列表为空时抛出NoSuchElementException异常，而pop()方法在列表为空时返回null。
 *      11.TreeSet将元素存在红黑树数据结构中，而HashSet使用的是散列函数。
 *      12.Queue:off()方法将一个元素插入队尾，peek()和element()在不移除元素的情况向返回队头，peek()返回null element()方法则抛出异常，poll()和remove()移除并返回队头，但poll()当队列为空时返回
 *         null而remove()方法则抛出异常。
 *      13.PriorityQueue:优先级队列。
 *      14.
 *
 */
package com.feng.chapter11;
package SocialRelationMining

import java.io.PrintWriter

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

/**
 * Created by yang on 15-12-30.
 */
object TestGetId {
  def main(args: Array[String]) {
    val source = Source.fromFile("/home/yang/Desktop/GraphData/LocNetworks/loc-gowalla_edges.txt", "GBK")
    val lineIter = source.getLines
    val AllId: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val outfile = new PrintWriter("/home/yang/Desktop/GraphData/LocNetworks/IDs.txt")

    lineIter.foreach(line =>{
      val pair = line.split("\\s+")
      AllId.append(pair(0).toInt)
    })

    val DistId = AllId.distinct

    for(i <- 0 until DistId.length){
      println(DistId(i))
      outfile.println(DistId(i))
    }
    println(AllId.length)
    println(DistId.length)

  }
}

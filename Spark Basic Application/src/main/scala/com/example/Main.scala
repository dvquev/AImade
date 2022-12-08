import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Main {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("SparkExample")
    val sc = new SparkContext(conf)

    val inputRDD = sc.textFile("input.txt")
    val countsRDD = inputRDD.flatMap(line => line.split(" "))
                           .map(word => (word, 1))
                           .reduceByKey(_ + _)
    countsRDD.saveAsTextFile("output")
  }
}

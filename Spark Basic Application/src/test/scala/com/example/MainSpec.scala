import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class MainSpec extends FlatSpec with ShouldMatchers {
  "The word count" should "be correct for the input file" in {
    val conf = new SparkConf().setAppName("SparkExample")
    val sc = new SparkContext(conf)

    val inputRDD = sc.textFile("input.txt")
    val countsRDD = inputRDD.flatMap(line => line.split(" "))
                           .map(word => (word, 1))
                           .reduceByKey(_ + _)

    val counts = countsRDD.collect()
    counts should contain ("hello" -> 2)
    counts should contain ("world" -> 1)
    // more assertions...
  }
}

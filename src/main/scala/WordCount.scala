import org.apache.spark.{SparkConf, SparkContext}

object WordCount {

  def main(args: Array[String]): Unit = {

    // set up environment
    val configuration = new SparkConf()
      .setAppName("Spark Hello World")
      .setMaster("local")
    val context = new SparkContext(configuration)

    // input
    val filePath = getClass.getResource("input.txt").getPath
    val input = context.textFile(filePath)

    // process
    val counts = input.flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)

    // output
    counts.collect().foreach(println)

    // stop
    context.stop()
  }
}

  params.each {
    println it.key + " - " + it.value
  }
  println "params is ${params}"
  def tempParams = params.toString()
  println "params to string is ${tempParams}"
  build job: 'sophia_test',
              propagate: false,
              parameters: [
                text(name: 'COMPARED_JOB_PARAMS', value: tempParams)
              ],
              wait: false
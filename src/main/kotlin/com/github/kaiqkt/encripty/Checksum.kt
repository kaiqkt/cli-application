package com.github.kaiqkt.encripty

import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters

import java.io.File
import java.math.BigInteger
import java.nio.file.Files
import java.security.MessageDigest
import java.util.concurrent.Callable
import kotlin.system.exitProcess


//@Command(name = "checksum", mixinStandardHelpOptions = true, version = ["Checksum CLI 0.1"],
//    description = ["Prints the checksum (MD5 by default) of a file to STDOUT."])
//class Checksum : Callable<Int> {
//
//    @Parameters(index = "0", description = ["The file whose checksum to calculate."])
//    lateinit var file: File
//
//    @Option(names = ["-a", "--algorithm"], description = ["MD5, SHA-1, SHA-256, ..."])
//    var algorithm = "MD5"
//
//    override fun call(): Int {
//        val fileContents = Files.readAllBytes(file.toPath())
//        val digest = MessageDigest.getInstance(algorithm).digest(fileContents)
//        println(("%0" + digest.size * 2 + "x").format(BigInteger(1, digest)))
//        return 0
//    }
//
//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) : Unit = exitProcess(CommandLine(Checksum()).execute(*args))
//    }
//}
package io.github.yzernik.bitcoinscodec.messages

import io.github.yzernik.bitcoinscodec.CodecSuite
import scodec.bits.ByteVector
import scodec.bits._
import scodec.codecs._
import io.github.yzernik.bitcoinscodec.structures._

class GetBlocksSpec extends CodecSuite {

  import GetBlocks._

  val getblocks = GetBlocks(
    1L,
    List(Hash(ByteVector.fill(32)(0x42))),
    Hash(ByteVector.fill(32)(0x42)))

  "GetBlocks codec" should {
    "roundtrip" in {
      roundtrip(GetBlocks.codec(1), getblocks)
      roundtrip(Message.codec(0xDAB5BFFAL, 1), getblocks)
    }

  }
}

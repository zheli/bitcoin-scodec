package io.github.yzernik.bitcoinscodec.messages

import io.github.yzernik.bitcoinscodec.structures.InvVect
import io.github.yzernik.bitcoinscodec.structures.Message
import io.github.yzernik.bitcoinscodec.structures.MessageCompanion
import io.github.yzernik.bitcoinscodec.structures.VarList

import scodec.Codec

case class GetData(invs: List[InvVect]) extends Message {
  type E = GetData
  def companion = GetData
}

object GetData extends MessageCompanion[GetData] {
  def codec(version: Int): Codec[GetData] =
    VarList.varList(Codec[InvVect]).as[GetData]
  def command = "getdata"
}
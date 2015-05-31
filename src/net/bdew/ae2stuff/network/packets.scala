/*
 * Copyright (c) bdew, 2014 - 2015
 * https://github.com/bdew/ae2stuff
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://bdew.net/minecraft-mod-public-license/
 */

package net.bdew.ae2stuff.network

import net.bdew.lib.network.ItemStackSerialize

case class MsgSetRecipe(recipe: Map[Int, ItemStackSerialize]) extends NetHandler.Message

case class MsgSetLock(slot: String, lock: Boolean) extends NetHandler.Message
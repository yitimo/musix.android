package com.yitimo.musix.navigator

import android.support.v4.app.Fragment
import com.yitimo.musix.pages.FindFragment
import com.yitimo.musix.pages.HomeFragment
import com.yitimo.musix.pages.MineFragment
import com.yitimo.musix.R

enum class BottomNavigationPosition(val position: Int, val id: Int) {
    HOME(0, R.id.home),
    FIND(1, R.id.find),
    MINE(2, R.id.mine)
}

fun findNavigationPositionById(id: Int): BottomNavigationPosition = when (id) {
    BottomNavigationPosition.HOME.id -> BottomNavigationPosition.HOME
    BottomNavigationPosition.FIND.id -> BottomNavigationPosition.FIND
    BottomNavigationPosition.MINE.id -> BottomNavigationPosition.MINE
    else -> BottomNavigationPosition.HOME
}

fun BottomNavigationPosition.createFragment(): Fragment = when (this) {
    BottomNavigationPosition.HOME -> HomeFragment.newInstance()
    BottomNavigationPosition.FIND -> FindFragment.newInstance()
    BottomNavigationPosition.MINE -> MineFragment.newInstance()
}

fun BottomNavigationPosition.getTag(): String = when (this) {
    BottomNavigationPosition.HOME -> HomeFragment.TAG
    BottomNavigationPosition.FIND -> FindFragment.TAG
    BottomNavigationPosition.MINE -> MineFragment.TAG
}

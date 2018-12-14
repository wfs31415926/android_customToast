package com.wufs.customtoastlibrary

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast

/**
 * Created by Jimmy on 2016/8/30 0030.
 */
class ToastUtils {

    private var mToast: Toast? = null

   public fun showShortToast(context: Context, text: String) {
        if (mToast != null) mToast!!.cancel()
        mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT)
        mToast!!.show()
    }

    fun showShortCenterToast(context: Context, text: String) {
        if (mToast != null) mToast!!.cancel()
        mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT)
        mToast!!.setGravity(Gravity.CENTER, 0, 0)
        mToast!!.show()
    }

    fun showShortToast(context: Context, resId: Int) {
        if (mToast != null) mToast!!.cancel()
        mToast = Toast.makeText(context, resId, Toast.LENGTH_SHORT)
        mToast!!.show()
    }

    fun showLongToast(context: Context, text: String) {
        if (mToast != null) mToast!!.cancel()
        mToast = Toast.makeText(context, text, Toast.LENGTH_LONG)
        mToast!!.show()
    }

    fun showLongToast(context: Context, resId: Int) {
        if (mToast != null) mToast!!.cancel()
        mToast = Toast.makeText(context, resId, Toast.LENGTH_SHORT)
        mToast!!.show()
    }

    fun showToast(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    fun showToast(context: Context, resId: Int) {
        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show()
    }

    fun showToastWithImg(context: Context, text: String, imgRes: Drawable) {
        if (mToast != null) {
            mToast!!.cancel()
        }
        mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT)
        mToast!!.setGravity(Gravity.CENTER, 0, 0)
        val textView = TextView(context)
        textView.gravity = Gravity.CENTER
        textView.textSize = 14f
        textView.setTextColor(Color.WHITE)
        textView.text = text
        textView.setPadding(25, 74, 25, 86)
        imgRes.setBounds(0, 0, imgRes.minimumWidth, imgRes.minimumHeight)
        textView.compoundDrawablePadding = 40
        textView.setCompoundDrawables(null, imgRes, null, null)
        textView.background = context.resources.getDrawable(R.drawable.shape_round_toast)
        mToast!!.view = textView
        mToast!!.show()
    }

}

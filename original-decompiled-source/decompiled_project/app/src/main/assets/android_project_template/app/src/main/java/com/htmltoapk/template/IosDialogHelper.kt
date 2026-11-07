package {{packageName}}

import android.app.Activity
import android.app.Dialog
import android.content.res.Configuration
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.view.animation.OvershootInterpolator
import android.widget.TextView

object IosDialogHelper {

    private fun applyIosTheme(view: View, activity: Activity) {
        val isNightMode = (activity.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES

        val titleView: TextView = view.findViewById(R.id.ios_dialog_title)
        val messageView: TextView = view.findViewById(R.id.ios_dialog_message)
        val dividerH: View = view.findViewById(R.id.ios_divider_horizontal)
        val dividerV: View? = view.findViewById(R.id.ios_divider_vertical)
        val cancelButton: TextView? = view.findViewById(R.id.ios_button_cancel)
        val confirmButton: TextView? = view.findViewById(R.id.ios_button_confirm)
        val singleButton: TextView? = view.findViewById(R.id.ios_button_single)

        if (isNightMode) {
            // Gece Modu (Dark Mode): Koyu kart üzerinde kristal beyaz ve gümüş metinler
            view.setBackgroundResource(R.drawable.bg_ios_dialog_dark)
            titleView.setTextColor(Color.WHITE)
            messageView.setTextColor(Color.parseColor("#D1D1D6"))
            dividerH.setBackgroundColor(Color.parseColor("#38FFFFFF"))
            dividerV?.setBackgroundColor(Color.parseColor("#38FFFFFF"))
            cancelButton?.setTextColor(Color.parseColor("#0A84FF"))
            confirmButton?.setTextColor(Color.parseColor("#FF453A"))
            singleButton?.setTextColor(Color.parseColor("#0A84FF"))
        } else {
            // Gündüz Modu (Light Mode): Açık kart üzerinde koyu siyah ve gri metinler
            view.setBackgroundResource(R.drawable.bg_ios_dialog_light)
            titleView.setTextColor(Color.BLACK)
            messageView.setTextColor(Color.parseColor("#4A4A4E"))
            dividerH.setBackgroundColor(Color.parseColor("#28000000"))
            dividerV?.setBackgroundColor(Color.parseColor("#28000000"))
            cancelButton?.setTextColor(Color.parseColor("#007AFF"))
            confirmButton?.setTextColor(Color.parseColor("#FF3B30"))
            singleButton?.setTextColor(Color.parseColor("#007AFF"))
        }
    }

    fun showExitConfirmation(activity: Activity, onConfirmExit: () -> Unit) {
        if (activity.isFinishing || activity.isDestroyed) return

        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        val view = LayoutInflater.from(activity).inflate(R.layout.dialog_ios_alert, null)
        applyIosTheme(view, activity)
        dialog.setContentView(view)

        dialog.window?.let { window ->
            window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window.setDimAmount(0.45f)
        }

        val titleView: TextView = view.findViewById(R.id.ios_dialog_title)
        val messageView: TextView = view.findViewById(R.id.ios_dialog_message)
        val twoButtons: View = view.findViewById(R.id.ios_two_buttons_container)
        val singleButton: View = view.findViewById(R.id.ios_button_single)
        val cancelButton: TextView = view.findViewById(R.id.ios_button_cancel)
        val confirmButton: TextView = view.findViewById(R.id.ios_button_confirm)

        titleView.setText(R.string.ios_dialog_exit_title)
        messageView.setText(R.string.ios_dialog_exit_message)

        twoButtons.visibility = View.VISIBLE
        singleButton.visibility = View.GONE

        cancelButton.setText(R.string.ios_dialog_cancel)
        confirmButton.setText(R.string.ios_dialog_exit)

        cancelButton.setOnClickListener {
            dialog.dismiss()
        }

        confirmButton.setOnClickListener {
            dialog.dismiss()
            onConfirmExit()
        }

        // iOS spring entrance animation
        view.scaleX = 0.88f
        view.scaleY = 0.88f
        view.alpha = 0f
        dialog.show()
        view.animate()
            .scaleX(1f)
            .scaleY(1f)
            .alpha(1f)
            .setDuration(220)
            .setInterpolator(OvershootInterpolator(1.1f))
            .start()
    }

    fun showNoInternet(activity: Activity, onRetry: () -> Unit): Dialog? {
        if (activity.isFinishing || activity.isDestroyed) return null

        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        val view = LayoutInflater.from(activity).inflate(R.layout.dialog_ios_alert, null)
        applyIosTheme(view, activity)
        dialog.setContentView(view)

        dialog.window?.let { window ->
            window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window.setDimAmount(0.45f)
        }

        val titleView: TextView = view.findViewById(R.id.ios_dialog_title)
        val messageView: TextView = view.findViewById(R.id.ios_dialog_message)
        val twoButtons: View = view.findViewById(R.id.ios_two_buttons_container)
        val singleButton: TextView = view.findViewById(R.id.ios_button_single)

        titleView.setText(R.string.ios_dialog_no_internet_title)
        messageView.setText(R.string.ios_dialog_no_internet_message)

        twoButtons.visibility = View.GONE
        singleButton.visibility = View.VISIBLE
        singleButton.setText(R.string.ios_dialog_retry)

        singleButton.setOnClickListener {
            onRetry()
        }

        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)

        view.scaleX = 0.88f
        view.scaleY = 0.88f
        view.alpha = 0f
        dialog.show()
        view.animate()
            .scaleX(1f)
            .scaleY(1f)
            .alpha(1f)
            .setDuration(220)
            .setInterpolator(OvershootInterpolator(1.1f))
            .start()

        return dialog
    }
}

package m;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import c4.d;
import com.basitce.htmltoapk.R;
import java.lang.reflect.Field;
import y3.c;
import y3.q0;

/* loaded from: classes.dex */
public final class f extends EditText implements y3.w {

    public class a {
    }

    private a getSuperCaller() {
        return null;
    }

    @Override // y3.w
    public final y3.c a(y3.c cVar) {
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        if (customSelectionActionModeCallback instanceof d.b) {
            throw null;
        }
        return customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        throw null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        throw null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        getSuperCaller().getClass();
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        super.onCreateInputConnection(editorInfo);
        throw null;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i10 < 31 && dragEvent.getLocalState() == null) {
            Field field = q0.f33885a;
            if ((i10 >= 31 ? q0.i.a(this) : (String[]) getTag(R.id.tag_on_receive_content_mime_types)) != null) {
                Context context = getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    }
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (activity == null) {
                    Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
                } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                    zA = n.a(dragEvent, this, activity);
                }
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        c.b aVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31) {
            Field field = q0.f33885a;
            if ((i11 >= 31 ? q0.i.a(this) : (String[]) getTag(R.id.tag_on_receive_content_mime_types)) != null && (i10 == 16908322 || i10 == 16908337)) {
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() > 0) {
                    if (i11 >= 31) {
                        aVar = new c.a(primaryClip, 1);
                    } else {
                        c.C0341c c0341c = new c.C0341c();
                        c0341c.f33794a = primaryClip;
                        c0341c.f33795b = 1;
                        aVar = c0341c;
                    }
                    aVar.a(i10 == 16908322 ? 0 : 1);
                    q0.d(this, aVar.build());
                }
                return true;
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z10) {
        throw null;
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        throw null;
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        throw null;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        getSuperCaller().getClass();
        throw null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}

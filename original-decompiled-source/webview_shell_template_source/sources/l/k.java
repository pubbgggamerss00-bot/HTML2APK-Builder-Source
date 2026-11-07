package l;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.htmltoapk.template.R;
import l.z;
import u0.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class k extends EditText implements u0.t {
    public final d s;

    /* renamed from: t, reason: collision with root package name */
    public final a0 f13681t;

    /* renamed from: u, reason: collision with root package name */
    public final z f13682u;

    /* renamed from: v, reason: collision with root package name */
    public final y0.e f13683v;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.gms.ads.mediation.customevent.a f13684w;

    /* renamed from: x, reason: collision with root package name */
    public a f13685x;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a {
        public a() {
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private a getSuperCaller() {
        if (this.f13685x == null) {
            this.f13685x = new a();
        }
        return this.f13685x;
    }

    @Override // u0.t
    public final u0.c a(u0.c cVar) {
        return this.f13683v.a(this, cVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.s;
        if (dVar != null) {
            dVar.a();
        }
        a0 a0Var = this.f13681t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return y0.d.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.s;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.s;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13681t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13681t.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f13682u) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = zVar.f13764b;
        return textClassifier == null ? z.a.a(zVar.f13763a) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r1
      0x0057: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006a, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i6;
        String[] strArrG;
        String[] stringArray;
        InputConnection eVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f13681t.getClass();
        a0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        androidx.activity.c0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i6 = Build.VERSION.SDK_INT) <= 30 && (strArrG = u0.f0.g(this)) != null) {
            if (i6 >= 25) {
                editorInfo.contentMimeTypes = strArrG;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrG);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrG);
            }
            androidx.camera.camera2.interop.g gVar = new androidx.camera.camera2.interop.g(3, this);
            if (i6 >= 25) {
                eVar = new w0.d(inputConnectionOnCreateInputConnection, gVar);
            } else {
                String[] strArr = w0.c.f14854a;
                if (i6 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                    if (strArr.length != 0) {
                        eVar = new w0.e(inputConnectionOnCreateInputConnection, gVar);
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                        }
                    }
                    if (strArr.length != 0) {
                    }
                }
            }
            inputConnectionOnCreateInputConnection = eVar;
        }
        return this.f13684w.e(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 30 || i6 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && u0.f0.g(this) != null) {
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
                zA = u.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i6) {
        c.b aVar;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 || u0.f0.g(this) == null || !(i6 == 16908322 || i6 == 16908337)) {
            return super.onTextContextMenuItem(i6);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i7 >= 31) {
                aVar = new c.a(primaryClip, 1);
            } else {
                c.C0094c c0094c = new c.C0094c();
                c0094c.f14457a = primaryClip;
                c0094c.f14458b = 1;
                aVar = c0094c;
            }
            aVar.b(i6 == 16908322 ? 0 : 1);
            u0.f0.i(this, aVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.s;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        d dVar = this.s;
        if (dVar != null) {
            dVar.f(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13681t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f13681t;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y0.d.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f13684w.f(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f13684w.c(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.s;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.s;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f13681t;
        a0Var.l(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f13681t;
        a0Var.m(mode);
        a0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        a0 a0Var = this.f13681t;
        if (a0Var != null) {
            a0Var.g(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f13682u) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.f13764b = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, R.attr.editTextStyle);
        y0.a(context);
        w0.a(getContext(), this);
        d dVar = new d(this);
        this.s = dVar;
        dVar.d(attributeSet, R.attr.editTextStyle);
        a0 a0Var = new a0(this);
        this.f13681t = a0Var;
        a0Var.f(attributeSet, R.attr.editTextStyle);
        a0Var.b();
        z zVar = new z();
        zVar.f13763a = this;
        this.f13682u = zVar;
        this.f13683v = new y0.e();
        com.google.android.gms.ads.mediation.customevent.a aVar = new com.google.android.gms.ads.mediation.customevent.a(this);
        this.f13684w = aVar;
        aVar.d(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerC = aVar.c(keyListener);
        if (keyListenerC == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerC);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}

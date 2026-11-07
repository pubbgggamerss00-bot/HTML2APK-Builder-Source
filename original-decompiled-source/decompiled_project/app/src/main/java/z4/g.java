package z4;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final m.c f34763a;

    /* renamed from: b, reason: collision with root package name */
    public a f34764b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34765c = true;

    public static class a extends d.f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f34766a;

        public a(m.c cVar) {
            this.f34766a = new WeakReference(cVar);
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            Handler handler;
            EditText editText = (EditText) this.f34766a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.a((EditText) this.f34766a.get(), 1);
        }
    }

    public g(m.c cVar) {
        this.f34763a = cVar;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
            if (editableText == null) {
                length = 0;
            } else {
                dVarA.getClass();
                length = editableText.length();
            }
            dVarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m.c cVar = this.f34763a;
        if (!cVar.isInEditMode() && this.f34765c && androidx.emoji2.text.d.d() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int iC = androidx.emoji2.text.d.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    androidx.emoji2.text.d.a().g(i10, i12 + i10, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
            if (this.f34764b == null) {
                this.f34764b = new a(cVar);
            }
            dVarA.h(this.f34764b);
        }
    }
}

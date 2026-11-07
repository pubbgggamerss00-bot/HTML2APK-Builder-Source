package f1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.g;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g implements TextWatcher {
    public final EditText s;

    /* renamed from: t, reason: collision with root package name */
    public a f12979t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12980u = true;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends g.f {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f12981a;

        public a(EditText editText) {
            this.f12981a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.g.f
        public final void a() throws Throwable {
            g.a((EditText) this.f12981a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.s = editText;
    }

    public static void a(EditText editText, int i6) throws Throwable {
        int length;
        if (i6 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.g gVarA = androidx.emoji2.text.g.a();
            if (editableText == null) {
                length = 0;
            } else {
                gVarA.getClass();
                length = editableText.length();
            }
            gVarA.e(editableText, 0, length);
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
    public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) throws Throwable {
        EditText editText = this.s;
        if (editText.isInEditMode() || !this.f12980u || androidx.emoji2.text.g.f991k == null || i7 > i8 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = androidx.emoji2.text.g.a().b();
        if (iB != 0) {
            if (iB == 1) {
                androidx.emoji2.text.g.a().e((Spannable) charSequence, i6, i8 + i6);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        androidx.emoji2.text.g gVarA = androidx.emoji2.text.g.a();
        if (this.f12979t == null) {
            this.f12979t = new a(editText);
        }
        gVarA.f(this.f12979t);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
    }
}

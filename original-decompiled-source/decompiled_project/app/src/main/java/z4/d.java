package z4;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f34752a;

    /* renamed from: b, reason: collision with root package name */
    public a f34753b;

    public static class a extends d.f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f34754a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f34755b;

        public a(TextView textView, d dVar) {
            this.f34754a = new WeakReference(textView);
            this.f34755b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            Handler handler;
            TextView textView = (TextView) this.f34754a.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.f34754a.get();
            InputFilter inputFilter = (InputFilter) this.f34755b.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            dVarA.getClass();
                            length = text.length();
                        }
                        CharSequence charSequenceG = dVarA.g(0, length, 0, text);
                        if (text == charSequenceG) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(charSequenceG);
                        int selectionEnd = Selection.getSelectionEnd(charSequenceG);
                        textView.setText(charSequenceG);
                        if (charSequenceG instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequenceG;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public d(TextView textView) {
        this.f34752a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f34752a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iC = androidx.emoji2.text.d.a().c();
        if (iC != 0) {
            if (iC == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.d.a().g(0, charSequence.length(), 0, charSequence);
            }
            if (iC != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
        if (this.f34753b == null) {
            this.f34753b = new a(textView, this);
        }
        dVarA.h(this.f34753b);
        return charSequence;
    }
}

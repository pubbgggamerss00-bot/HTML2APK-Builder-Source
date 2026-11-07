package f1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.g;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f12968a;

    /* renamed from: b, reason: collision with root package name */
    public a f12969b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends g.f {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f12970a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f12971b;

        public a(TextView textView, d dVar) {
            this.f12970a = new WeakReference(textView);
            this.f12971b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.g.f
        public final void a() throws Throwable {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.f12970a.get();
            InputFilter inputFilter = (InputFilter) this.f12971b.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        androidx.emoji2.text.g gVarA = androidx.emoji2.text.g.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            gVarA.getClass();
                            length = text.length();
                        }
                        CharSequence charSequenceE = gVarA.e(text, 0, length);
                        if (text == charSequenceE) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(charSequenceE);
                        int selectionEnd = Selection.getSelectionEnd(charSequenceE);
                        textView.setText(charSequenceE);
                        if (charSequenceE instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequenceE;
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
        this.f12968a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i6, int i7, Spanned spanned, int i8, int i9) {
        TextView textView = this.f12968a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = androidx.emoji2.text.g.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i9 == 0 && i8 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i6 != 0 || i7 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i6, i7);
                }
                return androidx.emoji2.text.g.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.g gVarA = androidx.emoji2.text.g.a();
        if (this.f12969b == null) {
            this.f12969b = new a(textView, this);
        }
        gVarA.f(this.f12969b);
        return charSequence;
    }
}

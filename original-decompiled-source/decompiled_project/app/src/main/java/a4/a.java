package a4;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a4.a$a, reason: collision with other inner class name */
    public static class C0001a {
        public static void a(EditorInfo editorInfo, CharSequence charSequence) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
        }
    }

    public static class b {
        public static void a(EditorInfo editorInfo, boolean z10) {
            editorInfo.setStylusHandwritingEnabled(z10);
        }
    }

    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            C0001a.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i10 >= 30) {
            C0001a.a(editorInfo, charSequence);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 : i11;
        if (i11 <= i12) {
            i11 = i12;
        }
        int length = charSequence.length();
        if (i13 < 0 || i11 > length) {
            c(editorInfo, null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            c(editorInfo, charSequence, i13, i11);
            return;
        }
        int i15 = i11 - i13;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int iMin = Math.min(charSequence.length() - i11, i17 - Math.min(i13, (int) (i17 * 0.8d)));
        int iMin2 = Math.min(i13, i17 - iMin);
        int i18 = i13 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i18))) {
            i18++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i11 + iMin) - 1))) {
            iMin--;
        }
        int i19 = iMin2 + i16;
        c(editorInfo, i16 != i15 ? TextUtils.concat(charSequence.subSequence(i18, i18 + iMin2), charSequence.subSequence(i11, iMin + i11)) : charSequence.subSequence(i18, i19 + iMin + i18), iMin2, i19);
    }

    public static void b(EditorInfo editorInfo, boolean z10) {
        if (Build.VERSION.SDK_INT >= 35) {
            b.a(editorInfo, z10);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z10);
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }
}

package v2;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.r;
import p.g0;
import u2.q;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f30553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30555c;

    /* renamed from: d, reason: collision with root package name */
    public final BreakIterator f30556d;

    public static final class a {
        public static boolean a(int i10) {
            int type = Character.getType(i10);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public g(CharSequence charSequence, int i10, Locale locale) {
        this.f30553a = charSequence;
        if (charSequence.length() < 0) {
            z2.a.a("input start index is outside the CharSequence");
        }
        if (i10 < 0 || i10 > charSequence.length()) {
            z2.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f30556d = wordInstance;
        this.f30554b = Math.max(0, -50);
        this.f30555c = Math.min(charSequence.length(), i10 + 50);
        wordInstance.setText(new q(charSequence, i10));
    }

    public final void a(int i10) {
        boolean z10 = false;
        int i11 = this.f30554b;
        int i12 = this.f30555c;
        if (i10 <= i12 && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbA = g0.a(i10, i11, "Invalid offset: ", ". Valid range is [", " , ");
        sbA.append(i12);
        sbA.append(']');
        z2.a.a(sbA.toString());
    }

    public final boolean b(int i10) {
        int i11 = this.f30554b + 1;
        if (i10 > this.f30555c || i11 > i10) {
            return false;
        }
        CharSequence charSequence = this.f30553a;
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i10))) {
            int i12 = i10 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i12))) {
                if (!androidx.emoji2.text.d.d()) {
                    return false;
                }
                androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
                if (dVarA.c() != 1 || dVarA.b(charSequence, i12) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(int i10) {
        int i11 = this.f30554b + 1;
        if (i10 > this.f30555c || i11 > i10) {
            return false;
        }
        return a.a(Character.codePointBefore(this.f30553a, i10));
    }

    public final boolean d(int i10) {
        a(i10);
        if (!this.f30556d.isBoundary(i10)) {
            return false;
        }
        if (f(i10) && f(i10 - 1) && f(i10 + 1)) {
            return false;
        }
        return i10 <= 0 || i10 >= this.f30553a.length() - 1 || !(e(i10) || e(i10 + 1));
    }

    public final boolean e(int i10) {
        int i11 = i10 - 1;
        CharSequence charSequence = this.f30553a;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i11));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (r.a(unicodeBlockOf, unicodeBlock) && r.a(Character.UnicodeBlock.of(charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return r.a(Character.UnicodeBlock.of(charSequence.charAt(i10)), unicodeBlock) && r.a(Character.UnicodeBlock.of(charSequence.charAt(i11)), Character.UnicodeBlock.KATAKANA);
    }

    public final boolean f(int i10) {
        if (i10 >= this.f30555c || this.f30554b > i10) {
            return false;
        }
        CharSequence charSequence = this.f30553a;
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i10)) && !Character.isSurrogate(charSequence.charAt(i10))) {
            if (!androidx.emoji2.text.d.d()) {
                return false;
            }
            androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
            if (dVarA.c() != 1 || dVarA.b(charSequence, i10) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(int i10) {
        if (i10 >= this.f30555c || this.f30554b > i10) {
            return false;
        }
        return a.a(Character.codePointAt(this.f30553a, i10));
    }

    public final int h(int i10) {
        a(i10);
        int iFollowing = this.f30556d.following(i10);
        return (f(iFollowing + (-1)) && f(iFollowing) && !e(iFollowing)) ? h(iFollowing) : iFollowing;
    }

    public final int i(int i10) {
        a(i10);
        int iPreceding = this.f30556d.preceding(i10);
        return (f(iPreceding) && b(iPreceding) && !e(iPreceding)) ? i(iPreceding) : iPreceding;
    }
}

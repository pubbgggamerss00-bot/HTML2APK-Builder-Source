package mh;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p.i0;

/* loaded from: classes2.dex */
public final class k implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f18274a;

    public static final class a {
    }

    public k(String pattern, n nVar) {
        kotlin.jvm.internal.r.e(pattern, "pattern");
        int i10 = nVar.f18279a;
        Pattern patternCompile = Pattern.compile(pattern, (i10 & 2) != 0 ? i10 | 64 : i10);
        kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
        this.f18274a = patternCompile;
    }

    public static lh.f c(final k kVar, final String input) {
        kVar.getClass();
        kotlin.jvm.internal.r.e(input, "input");
        if (input.length() < 0) {
            StringBuilder sbB = i0.b(0, "Start index out of bounds: ", ", input length: ");
            sbB.append(input.length());
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        eh.a aVar = new eh.a() { // from class: mh.j
            @Override // eh.a
            public final Object invoke() {
                return this.f18272a.b(input);
            }
        };
        l nextFunction = l.f18275a;
        kotlin.jvm.internal.r.e(nextFunction, "nextFunction");
        return new lh.f(aVar, nextFunction);
    }

    public final boolean a(CharSequence input) {
        kotlin.jvm.internal.r.e(input, "input");
        return this.f18274a.matcher(input).find();
    }

    public final i b(CharSequence input) {
        kotlin.jvm.internal.r.e(input, "input");
        Matcher matcher = this.f18274a.matcher(input);
        kotlin.jvm.internal.r.d(matcher, "matcher(...)");
        return m.a(matcher, 0, input);
    }

    public final i d(String input) {
        kotlin.jvm.internal.r.e(input, "input");
        Matcher matcher = this.f18274a.matcher(input);
        kotlin.jvm.internal.r.d(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new i(matcher, input);
        }
        return null;
    }

    public final boolean e(CharSequence input) {
        kotlin.jvm.internal.r.e(input, "input");
        return this.f18274a.matcher(input).matches();
    }

    public final String f(eh.l lVar, String input) {
        kotlin.jvm.internal.r.e(input, "input");
        i iVarB = b(input);
        if (iVarB == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        int i10 = 0;
        do {
            sb.append((CharSequence) input, i10, iVarB.b().f15744a);
            sb.append((CharSequence) lVar.invoke(iVarB));
            i10 = iVarB.b().f15745b + 1;
            iVarB = iVarB.next();
            if (i10 >= length) {
                break;
            }
        } while (iVarB != null);
        if (i10 < length) {
            sb.append((CharSequence) input, i10, length);
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }

    public final String toString() {
        String string = this.f18274a.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }

    public k(String pattern) {
        kotlin.jvm.internal.r.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
        this.f18274a = patternCompile;
    }

    public k(String str, Set<? extends n> set) {
        Iterator<T> it = set.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((c) it.next()).getValue();
        }
        Pattern patternCompile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
        this.f18274a = patternCompile;
    }
}

package mh;

import java.util.regex.Matcher;

/* loaded from: classes2.dex */
public final class m {
    public static final i a(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new i(matcher, charSequence);
        }
        return null;
    }
}

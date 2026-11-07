package lc;

/* loaded from: classes2.dex */
public abstract class c implements l<Character> {

    public static abstract class a extends c {
        @Override // lc.l
        @Deprecated
        public final boolean apply(Character ch2) {
            return a(ch2.charValue());
        }
    }

    public static final class b extends a {
        @Override // lc.c
        public final boolean a(char c10) {
            return c10 == '/';
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.is('");
            char[] cArr = new char[6];
            cArr[0] = '\\';
            cArr[1] = 'u';
            cArr[2] = 0;
            cArr[3] = 0;
            cArr[4] = 0;
            cArr[5] = 0;
            char c10 = '/';
            for (int i10 = 0; i10 < 4; i10++) {
                cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
            }
            sb.append(String.copyValueOf(cArr));
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: lc.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0171c extends a {
        public final String toString() {
            return "CharMatcher.none()";
        }
    }

    public static final class d extends AbstractC0171c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f16940a = new d();

        @Override // lc.c
        public final boolean a(char c10) {
            return false;
        }
    }

    public abstract boolean a(char c10);
}

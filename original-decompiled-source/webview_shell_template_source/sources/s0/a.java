package s0;

import android.text.SpannableStringBuilder;
import com.google.android.gms.ads.RequestConfiguration;
import s0.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f14311b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f14312c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f14313d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f14314e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14315a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: s0.a$a, reason: collision with other inner class name */
    public static class C0088a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f14316e = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f14317a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14318b;

        /* renamed from: c, reason: collision with root package name */
        public int f14319c;

        /* renamed from: d, reason: collision with root package name */
        public char f14320d;

        static {
            for (int i6 = 0; i6 < 1792; i6++) {
                f14316e[i6] = Character.getDirectionality(i6);
            }
        }

        public C0088a(CharSequence charSequence) {
            this.f14317a = charSequence;
            this.f14318b = charSequence.length();
        }

        public final byte a() {
            int i6 = this.f14319c - 1;
            CharSequence charSequence = this.f14317a;
            char cCharAt = charSequence.charAt(i6);
            this.f14320d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, this.f14319c);
                this.f14319c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f14319c--;
            char c7 = this.f14320d;
            return c7 < 1792 ? f14316e[c7] : Character.getDirectionality(c7);
        }
    }

    static {
        c.d dVar = c.f14327c;
        f14311b = Character.toString((char) 8206);
        f14312c = Character.toString((char) 8207);
        f14313d = new a(false);
        f14314e = new a(true);
    }

    public a(boolean z6) {
        c.d dVar = c.f14325a;
        this.f14315a = z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r0.f14319c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        C0088a c0088a = new C0088a(charSequence);
        c0088a.f14319c = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = c0088a.f14319c;
            if (i9 < c0088a.f14318b && i6 == 0) {
                CharSequence charSequence2 = c0088a.f14317a;
                char cCharAt = charSequence2.charAt(i9);
                c0088a.f14320d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c0088a.f14319c);
                    c0088a.f14319c = Character.charCount(iCodePointAt) + c0088a.f14319c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0088a.f14319c++;
                    char c7 = c0088a.f14320d;
                    directionality = c7 < 1792 ? C0088a.f14316e[c7] : Character.getDirectionality(c7);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i8 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i8++;
                                i7 = -1;
                                continue;
                            case 16:
                            case 17:
                                i8++;
                                i7 = 1;
                                continue;
                            case 18:
                                i8--;
                                i7 = 0;
                                continue;
                        }
                    }
                } else if (i8 == 0) {
                }
                i6 = i8;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        C0088a c0088a = new C0088a(charSequence);
        c0088a.f14319c = c0088a.f14318b;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            while (c0088a.f14319c > 0) {
                byte bA = c0088a.a();
                if (bA != 0) {
                    if (bA == 1 || bA == 2) {
                        if (i6 != 0) {
                            if (i7 == 0) {
                                break;
                            }
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i7 == i6) {
                                    return -1;
                                }
                                i6--;
                                break;
                            case 16:
                            case 17:
                                if (i7 == i6) {
                                    break;
                                }
                                i6--;
                                break;
                            case 18:
                                i6++;
                                break;
                            default:
                                if (i7 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i6 == 0) {
                        return -1;
                    }
                    if (i7 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        c.d dVar = c.f14327c;
        if (charSequence == null) {
            return null;
        }
        boolean zB = dVar.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zB2 = (zB ? c.f14326b : c.f14325a).b(charSequence, charSequence.length());
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String str2 = f14312c;
        String str3 = f14311b;
        boolean z6 = this.f14315a;
        spannableStringBuilder.append((CharSequence) ((z6 || !(zB2 || a(charSequence) == 1)) ? (!z6 || (zB2 && a(charSequence) != -1)) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2 : str3));
        if (zB != z6) {
            spannableStringBuilder.append(zB ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zB3 = (zB ? c.f14326b : c.f14325a).b(charSequence, charSequence.length());
        if (!z6 && (zB3 || b(charSequence) == 1)) {
            str = str3;
        } else if (z6 && (!zB3 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}

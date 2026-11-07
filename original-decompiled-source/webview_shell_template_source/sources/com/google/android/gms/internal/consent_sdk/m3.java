package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final m3 f11821a = new m3();

    /* renamed from: b, reason: collision with root package name */
    public static final m3 f11822b = new m3();

    /* renamed from: c, reason: collision with root package name */
    public static final m3 f11823c = new m3();

    /* renamed from: d, reason: collision with root package name */
    public static final m3 f11824d = new m3();

    /* renamed from: e, reason: collision with root package name */
    public static final m3 f11825e = new m3();

    /* renamed from: f, reason: collision with root package name */
    public static final m3 f11826f = new m3();

    /* renamed from: g, reason: collision with root package name */
    public static final m3 f11827g = new m3();

    public static String a(h6 h6Var) {
        StringBuilder sb = new StringBuilder(h6Var.e());
        for (int i6 = 0; i6 < h6Var.e(); i6++) {
            byte bC = h6Var.c(i6);
            if (bC == 34) {
                sb.append("\\\"");
            } else if (bC == 39) {
                sb.append("\\'");
            } else if (bC != 92) {
                switch (bC) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bC < 32 || bC > 126) {
                            sb.append('\\');
                            sb.append((char) (((bC >>> 6) & 3) + 48));
                            sb.append((char) (((bC >>> 3) & 7) + 48));
                            sb.append((char) ((bC & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bC);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}

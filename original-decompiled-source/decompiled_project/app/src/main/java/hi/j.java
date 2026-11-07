package hi;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class j implements Serializable, Comparable<j> {

    /* renamed from: d, reason: collision with root package name */
    public static final j f13075d = new j(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13076a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f13077b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f13078c;

    public static final class a {
        public static j a(String str) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (ii.b.a(str.charAt(i11 + 1)) + (ii.b.a(str.charAt(i11)) << 4));
            }
            return new j(bArr);
        }

        public static j b(String str) {
            kotlin.jvm.internal.r.e(str, "<this>");
            byte[] bytes = str.getBytes(mh.a.f18238b);
            kotlin.jvm.internal.r.d(bytes, "getBytes(...)");
            j jVar = new j(bytes);
            jVar.f13078c = str;
            return jVar;
        }
    }

    public j(byte[] data) {
        kotlin.jvm.internal.r.e(data, "data");
        this.f13076a = data;
    }

    public static int g(j jVar, j other) {
        jVar.getClass();
        kotlin.jvm.internal.r.e(other, "other");
        return jVar.f(0, other.h());
    }

    public static int k(j jVar, j other) {
        int i10 = b.f13032a;
        jVar.getClass();
        kotlin.jvm.internal.r.e(other, "other");
        return jVar.j(i10, other.h());
    }

    public static j o(j jVar, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = b.f13032a;
        }
        return jVar.n(i10, i11);
    }

    public String a() {
        byte[] map = hi.a.f13029a;
        byte[] bArr = this.f13076a;
        kotlin.jvm.internal.r.e(bArr, "<this>");
        kotlin.jvm.internal.r.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i10 + 2;
            byte b11 = bArr[i10 + 1];
            i10 += 3;
            byte b12 = bArr[i12];
            bArr2[i11] = map[(b10 & 255) >> 2];
            bArr2[i11 + 1] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = map[((b11 & RegisterType.DOUBLE_HI) << 2) | ((b12 & 255) >> 6)];
            i11 += 4;
            bArr2[i13] = map[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            bArr2[i11] = map[(b13 & 255) >> 2];
            bArr2[i11 + 1] = map[(b13 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b14 = bArr[i10];
            byte b15 = bArr[i14];
            bArr2[i11] = map[(b14 & 255) >> 2];
            bArr2[i11 + 1] = map[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr2[i11 + 2] = map[(b15 & RegisterType.DOUBLE_HI) << 2];
            bArr2[i11 + 3] = 61;
        }
        return new String(bArr2, mh.a.f18238b);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j other) {
        kotlin.jvm.internal.r.e(other, "other");
        int iD = d();
        int iD2 = other.d();
        int iMin = Math.min(iD, iD2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = i(i10) & 255;
            int i12 = other.i(i10) & 255;
            if (i11 != i12) {
                return i11 < i12 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public j c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f13076a, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.r.b(bArrDigest);
        return new j(bArrDigest);
    }

    public int d() {
        return this.f13076a.length;
    }

    public String e() {
        byte[] bArr = this.f13076a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = ii.b.f14536a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & RegisterType.DOUBLE_HI];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int iD = jVar.d();
            byte[] bArr = this.f13076a;
            if (iD == bArr.length && jVar.m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i10, byte[] other) {
        kotlin.jvm.internal.r.e(other, "other");
        byte[] bArr = this.f13076a;
        int length = bArr.length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.a(iMax, bArr, 0, other, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] h() {
        return this.f13076a;
    }

    public int hashCode() {
        int i10 = this.f13077b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f13076a);
        this.f13077b = iHashCode;
        return iHashCode;
    }

    public byte i(int i10) {
        return this.f13076a[i10];
    }

    public int j(int i10, byte[] other) {
        kotlin.jvm.internal.r.e(other, "other");
        if (i10 == b.f13032a) {
            i10 = d();
        }
        byte[] bArr = this.f13076a;
        for (int iMin = Math.min(i10, bArr.length - other.length); -1 < iMin; iMin--) {
            if (b.a(iMin, bArr, 0, other, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean l(int i10, j other, int i11) {
        kotlin.jvm.internal.r.e(other, "other");
        return other.m(0, this.f13076a, i10, i11);
    }

    public boolean m(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.r.e(other, "other");
        if (i10 < 0) {
            return false;
        }
        byte[] bArr = this.f13076a;
        return i10 <= bArr.length - i12 && i11 >= 0 && i11 <= other.length - i12 && b.a(i10, bArr, i11, other, i12);
    }

    public j n(int i10, int i11) {
        if (i11 == b.f13032a) {
            i11 = d();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f13076a;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException(b.b.a(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i11 - i10 >= 0) {
            return (i10 == 0 && i11 == bArr.length) ? this : new j(qg.m.j(bArr, i10, i11));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public j p() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f13076a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.r.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new j(bArrCopyOf);
            }
            i10++;
        }
    }

    public final String q() {
        String str = this.f13078c;
        if (str != null) {
            return str;
        }
        byte[] bArrH = h();
        kotlin.jvm.internal.r.e(bArrH, "<this>");
        String str2 = new String(bArrH, mh.a.f18238b);
        this.f13078c = str2;
        return str2;
    }

    public void r(g gVar, int i10) {
        gVar.i0(i10, this.f13076a);
    }

    public String toString() {
        byte b10;
        int i10;
        byte[] bArr = this.f13076a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            if (i11 >= length) {
                break;
            }
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                int i14 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (Byte.MAX_VALUE <= b11 && b11 < 160))) || b11 == 65533) {
                    break;
                }
                i12 += b11 < 65536 ? 1 : 2;
                i11++;
                while (true) {
                    i13 = i14;
                    if (i11 < length && (b10 = bArr[i11]) >= 0) {
                        i11++;
                        i14 = i13 + 1;
                        if (i13 == 64) {
                            break loop0;
                        }
                        if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (Byte.MAX_VALUE <= b10 && b10 < 160))) || b10 == 65533) {
                            break loop0;
                        }
                        i12 += b10 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } else if ((b11 >> 5) == -2) {
                int i15 = i11 + 1;
                if (length > i15) {
                    byte b12 = bArr[i15];
                    if ((b12 & 192) == 128) {
                        int i16 = (b12 ^ 3968) ^ (b11 << 6);
                        if (i16 >= 128) {
                            i10 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                break;
                            }
                            i12 += i16 < 65536 ? 1 : 2;
                            pg.f0 f0Var2 = pg.f0.f21461a;
                            i11 += 2;
                            i13 = i10;
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if ((b11 >> 4) == -2) {
                int i17 = i11 + 2;
                if (length > i17) {
                    byte b13 = bArr[i11 + 1];
                    if ((b13 & 192) == 128) {
                        byte b14 = bArr[i17];
                        if ((b14 & 192) == 128) {
                            int i18 = ((b14 ^ (-123008)) ^ (b13 << 6)) ^ (b11 << 12);
                            if (i18 < 2048) {
                                if (i13 != 64) {
                                    break;
                                }
                            } else if (55296 > i18 || i18 >= 57344) {
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                    break;
                                }
                                i12 += i18 < 65536 ? 1 : 2;
                                pg.f0 f0Var3 = pg.f0.f21461a;
                                i11 += 3;
                                i13 = i10;
                            } else if (i13 != 64) {
                                break;
                            }
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if ((b11 >> 3) == -2) {
                int i19 = i11 + 3;
                if (length > i19) {
                    byte b15 = bArr[i11 + 1];
                    if ((b15 & 192) == 128) {
                        byte b16 = bArr[i11 + 2];
                        if ((b16 & 192) == 128) {
                            byte b17 = bArr[i19];
                            if ((b17 & 192) == 128) {
                                int i20 = (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12)) ^ (b11 << RegisterType.REFERENCE);
                                if (i20 > 1114111) {
                                    if (i13 != 64) {
                                        break;
                                    }
                                } else if (55296 > i20 || i20 >= 57344) {
                                    if (i20 >= 65536) {
                                        i10 = i13 + 1;
                                        if (i13 == 64) {
                                            break;
                                        }
                                        if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                                            break;
                                        }
                                        i12 += i20 < 65536 ? 1 : 2;
                                        pg.f0 f0Var4 = pg.f0.f21461a;
                                        i11 += 4;
                                        i13 = i10;
                                    } else if (i13 != 64) {
                                        break;
                                    }
                                } else if (i13 != 64) {
                                    break;
                                }
                            } else if (i13 != 64) {
                                break;
                            }
                        } else if (i13 != 64) {
                            break;
                        }
                    } else if (i13 != 64) {
                        break;
                    }
                } else if (i13 != 64) {
                    break;
                }
            } else if (i13 != 64) {
                break;
            }
        }
        i12 = -1;
        if (i12 != -1) {
            String strQ = q();
            String strSubstring = strQ.substring(0, i12);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            String strN = mh.t.n(mh.t.n(mh.t.n(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i12 >= strQ.length()) {
                return "[text=" + strN + ']';
            }
            return "[size=" + bArr.length + " text=" + strN + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        int iD = 64 == b.f13032a ? d() : 64;
        if (iD > bArr.length) {
            throw new IllegalArgumentException(b.b.a(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (iD < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb.append((iD == bArr.length ? this : new j(qg.m.j(bArr, 0, iD))).e());
        sb.append("…]");
        return sb.toString();
    }
}

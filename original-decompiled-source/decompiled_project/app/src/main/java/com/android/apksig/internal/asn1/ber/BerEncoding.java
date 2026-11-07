package com.android.apksig.internal.asn1.ber;

import com.android.apksig.internal.asn1.Asn1TagClass;
import com.android.apksig.internal.asn1.Asn1Type;
import j2.y;
import k3.b;

/* loaded from: classes.dex */
public abstract class BerEncoding {
    public static final int ID_FLAG_CONSTRUCTED_ENCODING = 32;
    public static final int TAG_CLASS_APPLICATION = 1;
    public static final int TAG_CLASS_CONTEXT_SPECIFIC = 2;
    public static final int TAG_CLASS_PRIVATE = 3;
    public static final int TAG_CLASS_UNIVERSAL = 0;
    public static final int TAG_NUMBER_BIT_STRING = 3;
    public static final int TAG_NUMBER_BOOLEAN = 1;
    public static final int TAG_NUMBER_GENERALIZED_TIME = 24;
    public static final int TAG_NUMBER_INTEGER = 2;
    public static final int TAG_NUMBER_NULL = 5;
    public static final int TAG_NUMBER_OBJECT_IDENTIFIER = 6;
    public static final int TAG_NUMBER_OCTET_STRING = 4;
    public static final int TAG_NUMBER_SEQUENCE = 16;
    public static final int TAG_NUMBER_SET = 17;
    public static final int TAG_NUMBER_UTC_TIME = 23;

    /* renamed from: com.android.apksig.internal.asn1.ber.BerEncoding$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$asn1$Asn1TagClass;
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$asn1$Asn1Type;

        static {
            int[] iArr = new int[Asn1TagClass.values().length];
            $SwitchMap$com$android$apksig$internal$asn1$Asn1TagClass = iArr;
            try {
                iArr[Asn1TagClass.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1TagClass[Asn1TagClass.CONTEXT_SPECIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1TagClass[Asn1TagClass.PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1TagClass[Asn1TagClass.UNIVERSAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Asn1Type.values().length];
            $SwitchMap$com$android$apksig$internal$asn1$Asn1Type = iArr2;
            try {
                iArr2[Asn1Type.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.OBJECT_IDENTIFIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.OCTET_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.BIT_STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.SET_OF.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.SEQUENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.SEQUENCE_OF.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.UTC_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.GENERALIZED_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$asn1$Asn1Type[Asn1Type.BOOLEAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private BerEncoding() {
    }

    public static int getTagClass(byte b10) {
        return (b10 & 255) >> 6;
    }

    public static int getTagNumber(byte b10) {
        return b10 & 31;
    }

    public static boolean isConstructed(byte b10) {
        return (b10 & 32) != 0;
    }

    public static byte setTagClass(byte b10, int i10) {
        return (byte) ((b10 & 63) | (i10 << 6));
    }

    public static byte setTagNumber(byte b10, int i10) {
        return (byte) ((b10 & (-32)) | i10);
    }

    public static String tagClassAndNumberToString(int i10, int i11) {
        String strTagClassToString = tagClassToString(i10);
        String strTagNumberToString = tagNumberToString(i11);
        return strTagClassToString.isEmpty() ? strTagNumberToString : b.a(strTagClassToString, " ", strTagNumberToString);
    }

    public static String tagClassToString(int i10) {
        if (i10 == 0) {
            return "UNIVERSAL";
        }
        if (i10 == 1) {
            return "APPLICATION";
        }
        if (i10 == 2) {
            return "";
        }
        if (i10 == 3) {
            return "PRIVATE";
        }
        throw new IllegalArgumentException(y.a(i10, "Unsupported type class: "));
    }

    public static String tagNumberToString(int i10) {
        if (i10 == 16) {
            return "SEQUENCE";
        }
        if (i10 == 17) {
            return "SET";
        }
        if (i10 == 23) {
            return "UTC TIME";
        }
        if (i10 == 24) {
            return "GENERALIZED TIME";
        }
        switch (i10) {
            case 1:
                return "BOOLEAN";
            case 2:
                return "INTEGER";
            case 3:
                return "BIT STRING";
            case 4:
                return "OCTET STRING";
            case 5:
                return "NULL";
            case 6:
                return "OBJECT IDENTIFIER";
            default:
                return "0x" + Integer.toHexString(i10);
        }
    }

    public static int getTagClass(Asn1TagClass asn1TagClass) {
        int i10 = AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1TagClass[asn1TagClass.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 0;
                    }
                    throw new IllegalArgumentException("Unsupported tag class: " + asn1TagClass);
                }
            }
        }
        return i11;
    }

    public static int getTagNumber(Asn1Type asn1Type) {
        switch (AnonymousClass1.$SwitchMap$com$android$apksig$internal$asn1$Asn1Type[asn1Type.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 17;
            case 6:
            case 7:
                return 16;
            case 8:
                return 23;
            case 9:
                return 24;
            case 10:
                return 1;
            default:
                throw new IllegalArgumentException("Unsupported data type: " + asn1Type);
        }
    }
}

package org.jf.dexlib2;

import j2.y;
import java.util.EnumMap;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class Opcodes {
    public final int api;
    public final int artVersion;
    private final EnumMap<Opcode, Short> opcodeValues;
    private final HashMap<String, Opcode> opcodesByName;
    private final Opcode[] opcodesByValue = new Opcode[256];

    private Opcodes(int i10, int i11) {
        if (i10 >= 21) {
            this.api = i10;
            this.artVersion = VersionMap.mapApiToArtVersion(i10);
        } else if (i11 < 0 || i11 >= 39) {
            this.api = i10;
            this.artVersion = i11;
        } else {
            this.api = VersionMap.mapArtVersionToApi(i11);
            this.artVersion = i11;
        }
        this.opcodeValues = new EnumMap<>(Opcode.class);
        this.opcodesByName = new HashMap<>();
        int i12 = isArt() ? this.artVersion : this.api;
        for (Opcode opcode : Opcode.values()) {
            Short sh2 = (Short) (isArt() ? opcode.artVersionToValueMap : opcode.apiToValueMap).a(Integer.valueOf(i12));
            if (sh2 != null) {
                if (!opcode.format.isPayloadFormat) {
                    this.opcodesByValue[sh2.shortValue()] = opcode;
                }
                this.opcodeValues.put((EnumMap<Opcode, Short>) opcode, (Opcode) sh2);
                this.opcodesByName.put(opcode.name.toLowerCase(), opcode);
            }
        }
    }

    public static Opcodes forApi(int i10) {
        return new Opcodes(i10, -1);
    }

    public static Opcodes forArtVersion(int i10) {
        return new Opcodes(-1, i10);
    }

    public static Opcodes forDexVersion(int i10) {
        int iMapDexVersionToApi = VersionMap.mapDexVersionToApi(i10);
        if (iMapDexVersionToApi != -1) {
            return new Opcodes(iMapDexVersionToApi, -1);
        }
        throw new RuntimeException(y.a(i10, "Unsupported dex version "));
    }

    public static Opcodes getDefault() {
        return forApi(20);
    }

    public Opcode getOpcodeByName(String str) {
        return this.opcodesByName.get(str.toLowerCase());
    }

    public Opcode getOpcodeByValue(int i10) {
        if (i10 == 256) {
            return Opcode.PACKED_SWITCH_PAYLOAD;
        }
        if (i10 == 512) {
            return Opcode.SPARSE_SWITCH_PAYLOAD;
        }
        if (i10 == 768) {
            return Opcode.ARRAY_PAYLOAD;
        }
        if (i10 < 0) {
            return null;
        }
        Opcode[] opcodeArr = this.opcodesByValue;
        if (i10 < opcodeArr.length) {
            return opcodeArr[i10];
        }
        return null;
    }

    public Short getOpcodeValue(Opcode opcode) {
        return this.opcodeValues.get(opcode);
    }

    public boolean isArt() {
        return this.artVersion != -1;
    }
}

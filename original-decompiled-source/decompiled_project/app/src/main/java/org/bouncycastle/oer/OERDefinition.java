package org.bouncycastle.oer;

import j2.y;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import v5.b;

/* loaded from: classes3.dex */
public class OERDefinition {
    static final BigInteger[] uIntMax = {new BigInteger("256"), new BigInteger("65536"), new BigInteger("4294967296"), new BigInteger("18446744073709551616")};
    static final BigInteger[][] sIntRange = {new BigInteger[]{new BigInteger("-128"), new BigInteger("127")}, new BigInteger[]{new BigInteger("-32768"), new BigInteger("32767")}, new BigInteger[]{new BigInteger("-2147483648"), new BigInteger("2147483647")}, new BigInteger[]{new BigInteger("-9223372036854775808"), new BigInteger("9223372036854775807")}};

    public enum BaseType {
        SEQ,
        SEQ_OF,
        CHOICE,
        ENUM,
        INT,
        OCTET_STRING,
        OPAQUE,
        UTF8_STRING,
        BIT_STRING,
        NULL,
        EXTENSION,
        ENUM_ITEM,
        BOOLEAN,
        IS0646String,
        PrintableString,
        NumericString,
        BMPString,
        UniversalString,
        IA5String,
        VisibleString,
        Switch,
        Supplier
    }

    public static class Builder {
        protected Switch aSwitch;
        protected final BaseType baseType;
        protected int block;
        protected ASN1Encodable defaultValue;
        protected ElementSupplier elementSupplier;
        protected BigInteger enumValue;
        protected Boolean inScope;
        protected String label;
        protected BigInteger lowerBound;
        protected boolean mayRecurse;
        protected Builder placeholderValue;
        protected String typeName;
        protected BigInteger upperBound;
        protected ArrayList<Builder> children = new ArrayList<>();
        protected boolean explicit = true;
        protected ArrayList<ASN1Encodable> validSwitchValues = new ArrayList<>();
        protected Map<String, ElementSupplier> supplierMap = new HashMap();
        private final ItemProvider defaultItemProvider = new ItemProvider() { // from class: org.bouncycastle.oer.OERDefinition.Builder.1
            @Override // org.bouncycastle.oer.OERDefinition.ItemProvider
            public Builder existingChild(int i10, Builder builder) {
                return builder.copy(Builder.this.defaultItemProvider);
            }
        };

        public Builder(BaseType baseType) {
            this.baseType = baseType;
        }

        public void addExtensions(Builder builder, ExtensionList extensionList) {
            if (extensionList.isEmpty()) {
                Builder builder2 = new Builder(BaseType.EXTENSION);
                builder2.block = extensionList.block;
                builder.children.add(builder2);
                return;
            }
            int size = extensionList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = extensionList.get(i10);
                i10++;
                if (obj instanceof OptionalList) {
                    addOptionals(builder, extensionList.block, (OptionalList) obj);
                } else {
                    Builder builderWrap = wrap(true, obj);
                    builderWrap.block = extensionList.block;
                    builder.children.add(builderWrap);
                }
            }
        }

        public void addOptionals(Builder builder, int i10, OptionalList optionalList) {
            int size = optionalList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = optionalList.get(i11);
                i11++;
                if (obj instanceof ExtensionList) {
                    addExtensions(builder, (ExtensionList) obj);
                } else {
                    Builder builderWrap = wrap(false, obj);
                    builderWrap.block = i10;
                    builder.children.add(builderWrap);
                }
            }
        }

        public Builder block(int i10) {
            Builder builderCopy = copy();
            builderCopy.block = i10;
            return builderCopy;
        }

        public Element build() {
            ArrayList<ASN1Encodable> arrayList;
            Map<String, ElementSupplier> map;
            ArrayList arrayList2 = new ArrayList();
            boolean z10 = false;
            if (this.baseType == BaseType.ENUM) {
                HashSet hashSet = new HashSet();
                int i10 = 0;
                for (int i11 = 0; i11 < this.children.size(); i11++) {
                    Builder builder = this.children.get(i11);
                    if (builder.enumValue == null) {
                        builder.enumValue = BigInteger.valueOf(i10);
                        i10++;
                    }
                    if (hashSet.contains(builder.enumValue)) {
                        throw new IllegalStateException(y.a(i11, "duplicate enum value at index "));
                    }
                    hashSet.add(builder.enumValue);
                }
            }
            ArrayList<Builder> arrayList3 = this.children;
            int size = arrayList3.size();
            int i12 = 0;
            boolean z11 = false;
            int i13 = 0;
            boolean z12 = false;
            while (i12 < size) {
                Builder builder2 = arrayList3.get(i12);
                i12++;
                Builder builder3 = builder2;
                if (!z11 && builder3.block > 0) {
                    z11 = true;
                }
                if (!builder3.explicit) {
                    i13++;
                }
                if (!z12 && builder3.defaultValue != null) {
                    z12 = true;
                }
                arrayList2.add(builder3.build());
            }
            BaseType baseType = this.baseType;
            ASN1Encodable aSN1Encodable = this.defaultValue;
            if (aSN1Encodable == null && this.explicit) {
                z10 = true;
            }
            String str = this.label;
            BigInteger bigInteger = this.lowerBound;
            BigInteger bigInteger2 = this.upperBound;
            BigInteger bigInteger3 = this.enumValue;
            Switch r11 = this.aSwitch;
            if (this.validSwitchValues.isEmpty()) {
                arrayList = null;
                map = null;
            } else {
                arrayList = this.validSwitchValues;
                map = null;
            }
            ElementSupplier elementSupplier = this.elementSupplier;
            Map<String, ElementSupplier> map2 = map;
            boolean z13 = this.mayRecurse;
            Map<String, ElementSupplier> map3 = map2;
            String str2 = this.typeName;
            if (!this.supplierMap.isEmpty()) {
                map3 = this.supplierMap;
            }
            return new Element(baseType, arrayList2, z10, str, bigInteger, bigInteger2, z11, bigInteger3, aSN1Encodable, r11, arrayList, elementSupplier, z13, str2, map3, this.block, i13, z12);
        }

        public Builder copy() {
            return copy(this.defaultItemProvider);
        }

        public Builder decodeSwitch(Switch r22) {
            Builder builderCopy = copy();
            builderCopy.aSwitch = r22;
            return builderCopy;
        }

        public Builder defaultValue(ASN1Encodable aSN1Encodable) {
            Builder builderCopy = copy();
            builderCopy.defaultValue = aSN1Encodable;
            return builderCopy;
        }

        public Builder elementSupplier(ElementSupplier elementSupplier) {
            Builder builderCopy = copy();
            builderCopy.elementSupplier = elementSupplier;
            return builderCopy;
        }

        public Builder enumValue(BigInteger bigInteger) {
            Builder builderCopy = copy();
            this.enumValue = bigInteger;
            return builderCopy;
        }

        public Builder explicit(boolean z10) {
            Builder builderCopy = copy();
            builderCopy.explicit = z10;
            return builderCopy;
        }

        public Builder fixedSize(long j10) {
            Builder builderCopy = copy();
            builderCopy.upperBound = BigInteger.valueOf(j10);
            builderCopy.lowerBound = BigInteger.valueOf(j10);
            return builderCopy;
        }

        public Builder inScope(boolean z10) {
            Builder builderCopy = copy();
            builderCopy.inScope = Boolean.valueOf(z10);
            return builderCopy;
        }

        public Builder items(Object... objArr) {
            Builder builderCopy = copy();
            for (int i10 = 0; i10 != objArr.length; i10++) {
                Object obj = objArr[i10];
                if (obj instanceof ExtensionList) {
                    addExtensions(builderCopy, (ExtensionList) obj);
                } else if (obj instanceof OptionalList) {
                    addOptionals(builderCopy, builderCopy.block, (OptionalList) obj);
                } else if (obj.getClass().isArray()) {
                    int i11 = 0;
                    while (true) {
                        Object[] objArr2 = (Object[]) obj;
                        if (i11 < objArr2.length) {
                            builderCopy.children.add(wrap(true, objArr2[i11]));
                            i11++;
                        }
                    }
                } else {
                    builderCopy.children.add(wrap(true, obj));
                }
            }
            return builderCopy;
        }

        public Builder label(String str) {
            Builder builderCopy = copy();
            builderCopy.label = str;
            return builderCopy;
        }

        public Builder labelPrefix(String str) {
            Builder builderCopy = copy();
            StringBuilder sbA = b.a(str, " ");
            sbA.append(this.label);
            builderCopy.label = sbA.toString();
            return builderCopy;
        }

        public Builder limitScopeTo(String... strArr) {
            Builder builderCopy = copy();
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(strArr));
            ArrayList<Builder> arrayList = new ArrayList<>();
            ArrayList<Builder> arrayList2 = this.children;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Builder builder = arrayList2.get(i10);
                i10++;
                Builder builder2 = builder;
                arrayList.add(builder2.copy().inScope(hashSet.contains(builder2.label)));
            }
            builderCopy.children = arrayList;
            return builderCopy;
        }

        public Builder mayRecurse(boolean z10) {
            Builder builderCopy = copy();
            builderCopy.mayRecurse = z10;
            return builderCopy;
        }

        public Builder range(long j10, long j11, ASN1Encodable aSN1Encodable) {
            Builder builderCopy = copy();
            builderCopy.lowerBound = BigInteger.valueOf(j10);
            builderCopy.upperBound = BigInteger.valueOf(j11);
            builderCopy.defaultValue = aSN1Encodable;
            return builderCopy;
        }

        public Builder rangeToMAXFrom(long j10) {
            Builder builderCopy = copy();
            builderCopy.lowerBound = BigInteger.valueOf(j10);
            builderCopy.upperBound = null;
            return builderCopy;
        }

        public Builder rangeZeroTo(long j10) {
            Builder builderCopy = copy();
            builderCopy.upperBound = BigInteger.valueOf(j10);
            builderCopy.lowerBound = BigInteger.ZERO;
            return builderCopy;
        }

        public Builder replaceChild(final int i10, final Builder builder) {
            return copy(new ItemProvider() { // from class: org.bouncycastle.oer.OERDefinition.Builder.2
                @Override // org.bouncycastle.oer.OERDefinition.ItemProvider
                public Builder existingChild(int i11, Builder builder2) {
                    return i10 == i11 ? builder : builder2;
                }
            });
        }

        public Builder typeName(String str) {
            Builder builderCopy = copy();
            builderCopy.typeName = str;
            if (builderCopy.label == null) {
                builderCopy.label = str;
            }
            return builderCopy;
        }

        public Builder unbounded() {
            Builder builderCopy = copy();
            builderCopy.lowerBound = null;
            builderCopy.upperBound = null;
            return builderCopy;
        }

        public Builder validSwitchValue(ASN1Encodable... aSN1EncodableArr) {
            Builder builderCopy = copy();
            builderCopy.validSwitchValues.addAll(Arrays.asList(aSN1EncodableArr));
            return builderCopy;
        }

        public Builder wrap(boolean z10, Object obj) {
            if (obj instanceof Builder) {
                return ((Builder) obj).explicit(z10);
            }
            if (obj instanceof BaseType) {
                return new Builder((BaseType) obj).explicit(z10);
            }
            if (obj instanceof String) {
                return OERDefinition.enumItem((String) obj);
            }
            throw new IllegalStateException("Unable to wrap item in builder");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder copy(ItemProvider itemProvider) {
            Builder builder = new Builder(this.baseType);
            ArrayList<Builder> arrayList = this.children;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Builder builder2 = arrayList.get(i11);
                i11++;
                builder.children.add(itemProvider.existingChild(i10, builder2));
                i10++;
            }
            builder.explicit = this.explicit;
            builder.label = this.label;
            builder.upperBound = this.upperBound;
            builder.lowerBound = this.lowerBound;
            builder.defaultValue = this.defaultValue;
            builder.enumValue = this.enumValue;
            builder.inScope = this.inScope;
            builder.aSwitch = this.aSwitch;
            builder.validSwitchValues = new ArrayList<>(this.validSwitchValues);
            builder.elementSupplier = this.elementSupplier;
            builder.mayRecurse = this.mayRecurse;
            builder.typeName = this.typeName;
            builder.supplierMap = new HashMap(this.supplierMap);
            builder.block = this.block;
            return builder;
        }

        public Builder range(BigInteger bigInteger, BigInteger bigInteger2) {
            Builder builderCopy = copy();
            builderCopy.lowerBound = bigInteger;
            builderCopy.upperBound = bigInteger2;
            return builderCopy;
        }
    }

    public static class ExtensionList extends ArrayList<Object> {
        protected final int block;

        public ExtensionList(int i10, List<Object> list) {
            this.block = i10;
            addAll(list);
        }
    }

    public interface ItemProvider {
        Builder existingChild(int i10, Builder builder);
    }

    public static class MutableBuilder extends Builder {
        private boolean frozen;

        public MutableBuilder(BaseType baseType) {
            super(baseType);
            this.frozen = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MutableBuilder addItemsAndFreeze(Builder... builderArr) {
            if (this.frozen) {
                throw new IllegalStateException("build cannot be modified and must be copied only");
            }
            for (int i10 = 0; i10 != builderArr.length; i10++) {
                Object[] objArr = builderArr[i10];
                if (objArr.getClass().isArray()) {
                    for (Object obj : objArr) {
                        this.children.add(wrap(true, obj));
                    }
                } else {
                    this.children.add(wrap(true, objArr));
                }
            }
            this.frozen = true;
            return this;
        }

        @Override // org.bouncycastle.oer.OERDefinition.Builder
        public MutableBuilder label(String str) {
            this.label = str;
            return this;
        }
    }

    public static class OptionalList extends ArrayList<Object> {
        public OptionalList(List<Object> list) {
            addAll(list);
        }
    }

    public static Builder aSwitch(Switch r22) {
        return new Builder(BaseType.Switch).decodeSwitch(r22);
    }

    public static Builder bitString(long j10) {
        return new Builder(BaseType.BIT_STRING).fixedSize(j10);
    }

    public static Builder bool() {
        return new Builder(BaseType.BOOLEAN);
    }

    public static Builder choice(Object... objArr) {
        return new Builder(BaseType.CHOICE).items(objArr);
    }

    public static Builder deferred(ElementSupplier elementSupplier) {
        return new Builder(BaseType.Supplier).elementSupplier(elementSupplier);
    }

    public static Builder enumItem(String str) {
        return new Builder(BaseType.ENUM_ITEM).label(str);
    }

    public static Builder enumeration(Object... objArr) {
        return new Builder(BaseType.ENUM).items(objArr);
    }

    public static ExtensionList extension(int i10, Object... objArr) {
        return new ExtensionList(i10, Arrays.asList(objArr));
    }

    public static Builder ia5String() {
        return new Builder(BaseType.IA5String);
    }

    public static Builder integer() {
        return new Builder(BaseType.INT);
    }

    public static Builder nullValue() {
        return new Builder(BaseType.NULL);
    }

    public static Builder octets() {
        return new Builder(BaseType.OCTET_STRING).unbounded();
    }

    public static Builder opaque() {
        return new Builder(BaseType.OPAQUE);
    }

    public static List<Object> optional(Object... objArr) {
        return new OptionalList(Arrays.asList(objArr));
    }

    public static Builder placeholder() {
        return new Builder(null);
    }

    public static Builder seq() {
        return new Builder(BaseType.SEQ);
    }

    public static Builder seqof(Object... objArr) {
        return new Builder(BaseType.SEQ_OF).items(objArr);
    }

    public static Builder utf8String() {
        return new Builder(BaseType.UTF8_STRING);
    }

    public static Builder enumItem(String str, BigInteger bigInteger) {
        return new Builder(BaseType.ENUM_ITEM).enumValue(bigInteger).label(str);
    }

    public static ExtensionList extension(Object... objArr) {
        return new ExtensionList(1, Arrays.asList(objArr));
    }

    public static Builder integer(long j10) {
        return new Builder(BaseType.INT).defaultValue(new ASN1Integer(j10));
    }

    public static Builder octets(int i10) {
        return new Builder(BaseType.OCTET_STRING).fixedSize(i10);
    }

    public static Builder seq(Object... objArr) {
        return new Builder(BaseType.SEQ).items(objArr);
    }

    public static Builder utf8String(int i10) {
        return new Builder(BaseType.UTF8_STRING).rangeToMAXFrom(i10);
    }

    public static Builder integer(long j10, long j11) {
        return new Builder(BaseType.INT).range(BigInteger.valueOf(j10), BigInteger.valueOf(j11));
    }

    public static Builder octets(int i10, int i11) {
        return new Builder(BaseType.OCTET_STRING).range(BigInteger.valueOf(i10), BigInteger.valueOf(i11));
    }

    public static Builder utf8String(int i10, int i11) {
        return new Builder(BaseType.UTF8_STRING).range(BigInteger.valueOf(i10), BigInteger.valueOf(i11));
    }

    public static Builder integer(long j10, long j11, ASN1Encodable aSN1Encodable) {
        return new Builder(BaseType.INT).range(j10, j11, aSN1Encodable);
    }

    public static Builder integer(BigInteger bigInteger, BigInteger bigInteger2) {
        return new Builder(BaseType.INT).range(bigInteger, bigInteger2);
    }
}

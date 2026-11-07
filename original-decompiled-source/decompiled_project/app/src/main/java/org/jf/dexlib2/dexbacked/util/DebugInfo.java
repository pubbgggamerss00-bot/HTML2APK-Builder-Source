package org.jf.dexlib2.dexbacked.util;

import java.util.Arrays;
import java.util.Iterator;
import kf.a;
import nc.v;
import nc.w0;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBackedMethod;
import org.jf.dexlib2.dexbacked.DexBackedMethodImplementation;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.debug.EndLocal;
import org.jf.dexlib2.iface.debug.LocalInfo;
import org.jf.dexlib2.immutable.debug.ImmutableEndLocal;
import org.jf.dexlib2.immutable.debug.ImmutableEpilogueBegin;
import org.jf.dexlib2.immutable.debug.ImmutableLineNumber;
import org.jf.dexlib2.immutable.debug.ImmutablePrologueEnd;
import org.jf.dexlib2.immutable.debug.ImmutableRestartLocal;
import org.jf.dexlib2.immutable.debug.ImmutableSetSourceFile;
import org.jf.dexlib2.immutable.debug.ImmutableStartLocal;

/* loaded from: classes3.dex */
public abstract class DebugInfo implements Iterable<DebugItem> {

    public static class DebugInfoImpl extends DebugInfo {
        private static final LocalInfo EMPTY_LOCAL_INFO = new LocalInfo() { // from class: org.jf.dexlib2.dexbacked.util.DebugInfo.DebugInfoImpl.1
            @Override // org.jf.dexlib2.iface.debug.LocalInfo
            public String getName() {
                return null;
            }

            @Override // org.jf.dexlib2.iface.debug.LocalInfo
            public String getSignature() {
                return null;
            }

            @Override // org.jf.dexlib2.iface.debug.LocalInfo
            public String getType() {
                return null;
            }
        };
        private final int debugInfoOffset;
        public final DexBackedDexFile dexFile;
        private final DexBackedMethodImplementation methodImpl;

        public DebugInfoImpl(DexBackedDexFile dexBackedDexFile, int i10, DexBackedMethodImplementation dexBackedMethodImplementation) {
            this.dexFile = dexBackedDexFile;
            this.debugInfoOffset = i10;
            this.methodImpl = dexBackedMethodImplementation;
        }

        @Override // org.jf.dexlib2.dexbacked.util.DebugInfo
        public int getSize() {
            Iterator<DebugItem> it = iterator();
            while (it.hasNext()) {
                it.next();
            }
            return ((VariableSizeLookaheadIterator) it).getReaderOffset() - this.debugInfoOffset;
        }

        @Override // java.lang.Iterable
        public Iterator<DebugItem> iterator() {
            LocalInfo localInfo;
            String type;
            DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(this.debugInfoOffset);
            int bigUleb128 = dexReader.readBigUleb128();
            int registerCount = this.methodImpl.getRegisterCount();
            LocalInfo[] localInfoArr = new LocalInfo[registerCount];
            Arrays.fill(localInfoArr, EMPTY_LOCAL_INFO);
            DexBackedMethod dexBackedMethod = this.methodImpl.method;
            ParameterIterator parameterIterator = new ParameterIterator(dexBackedMethod.getParameterTypes(), dexBackedMethod.getParameterAnnotations(), getParameterNames((DexReader) dexReader));
            int i10 = 0;
            if (!AccessFlags.STATIC.isSet(this.methodImpl.method.getAccessFlags())) {
                localInfoArr[0] = new LocalInfo() { // from class: org.jf.dexlib2.dexbacked.util.DebugInfo.DebugInfoImpl.2
                    @Override // org.jf.dexlib2.iface.debug.LocalInfo
                    public String getName() {
                        return "this";
                    }

                    @Override // org.jf.dexlib2.iface.debug.LocalInfo
                    public String getSignature() {
                        return null;
                    }

                    @Override // org.jf.dexlib2.iface.debug.LocalInfo
                    public String getType() {
                        return DebugInfoImpl.this.methodImpl.method.getDefiningClass();
                    }
                };
                i10 = 1;
            }
            while (parameterIterator.hasNext()) {
                localInfoArr[i10] = parameterIterator.next();
                i10++;
            }
            if (i10 < registerCount) {
                int i11 = registerCount - 1;
                while (true) {
                    i10--;
                    if (i10 <= -1 || ((type = (localInfo = localInfoArr[i10]).getType()) != null && ((type.equals("J") || type.equals(a.f16304c)) && i11 - 1 == i10))) {
                        break;
                    }
                    localInfoArr[i11] = localInfo;
                    localInfoArr[i10] = EMPTY_LOCAL_INFO;
                    i11--;
                }
            }
            return new VariableSizeLookaheadIterator<DebugItem>(this.dexFile.getDataBuffer(), dexReader.getOffset(), bigUleb128, localInfoArr) { // from class: org.jf.dexlib2.dexbacked.util.DebugInfo.DebugInfoImpl.3
                private int codeAddress = 0;
                private int lineNumber;
                final /* synthetic */ int val$lineNumberStart;
                final /* synthetic */ LocalInfo[] val$locals;

                {
                    this.val$lineNumberStart = bigUleb128;
                    this.val$locals = localInfoArr;
                    this.lineNumber = bigUleb128;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeLookaheadIterator
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public DebugItem readNextItem(DexReader dexReader2) {
                    LocalInfo localInfo2;
                    LocalInfo localInfo3;
                    while (true) {
                        int ubyte = dexReader2.readUbyte();
                        boolean z10 = true;
                        switch (ubyte) {
                            case 0:
                                return endOfData();
                            case 1:
                                this.codeAddress += dexReader2.readSmallUleb128();
                                break;
                            case 2:
                                this.lineNumber += dexReader2.readSleb128();
                                break;
                            case 3:
                                int smallUleb128 = dexReader2.readSmallUleb128();
                                ImmutableStartLocal immutableStartLocal = new ImmutableStartLocal(this.codeAddress, smallUleb128, DebugInfoImpl.this.dexFile.getStringSection().getOptional(dexReader2.readSmallUleb128() - 1), DebugInfoImpl.this.dexFile.getTypeSection().getOptional(dexReader2.readSmallUleb128() - 1), null);
                                if (smallUleb128 >= 0) {
                                    LocalInfo[] localInfoArr2 = this.val$locals;
                                    if (smallUleb128 < localInfoArr2.length) {
                                        localInfoArr2[smallUleb128] = immutableStartLocal;
                                    }
                                }
                                return immutableStartLocal;
                            case 4:
                                int smallUleb1282 = dexReader2.readSmallUleb128();
                                ImmutableStartLocal immutableStartLocal2 = new ImmutableStartLocal(this.codeAddress, smallUleb1282, DebugInfoImpl.this.dexFile.getStringSection().getOptional(dexReader2.readSmallUleb128() - 1), DebugInfoImpl.this.dexFile.getTypeSection().getOptional(dexReader2.readSmallUleb128() - 1), DebugInfoImpl.this.dexFile.getStringSection().getOptional(dexReader2.readSmallUleb128() - 1));
                                if (smallUleb1282 >= 0) {
                                    LocalInfo[] localInfoArr3 = this.val$locals;
                                    if (smallUleb1282 < localInfoArr3.length) {
                                        localInfoArr3[smallUleb1282] = immutableStartLocal2;
                                    }
                                }
                                return immutableStartLocal2;
                            case 5:
                                int smallUleb1283 = dexReader2.readSmallUleb128();
                                boolean z11 = false;
                                if (smallUleb1283 >= 0) {
                                    LocalInfo[] localInfoArr4 = this.val$locals;
                                    if (smallUleb1283 < localInfoArr4.length) {
                                        localInfo2 = localInfoArr4[smallUleb1283];
                                    } else {
                                        localInfo2 = DebugInfoImpl.EMPTY_LOCAL_INFO;
                                        z10 = false;
                                    }
                                }
                                if (localInfo2 instanceof EndLocal) {
                                    localInfo2 = DebugInfoImpl.EMPTY_LOCAL_INFO;
                                } else {
                                    z11 = z10;
                                }
                                ImmutableEndLocal immutableEndLocal = new ImmutableEndLocal(this.codeAddress, smallUleb1283, localInfo2.getName(), localInfo2.getType(), localInfo2.getSignature());
                                if (z11) {
                                    this.val$locals[smallUleb1283] = immutableEndLocal;
                                }
                                return immutableEndLocal;
                            case 6:
                                int smallUleb1284 = dexReader2.readSmallUleb128();
                                if (smallUleb1284 >= 0) {
                                    LocalInfo[] localInfoArr5 = this.val$locals;
                                    localInfo3 = smallUleb1284 < localInfoArr5.length ? localInfoArr5[smallUleb1284] : DebugInfoImpl.EMPTY_LOCAL_INFO;
                                }
                                ImmutableRestartLocal immutableRestartLocal = new ImmutableRestartLocal(this.codeAddress, smallUleb1284, localInfo3.getName(), localInfo3.getType(), localInfo3.getSignature());
                                if (smallUleb1284 >= 0) {
                                    LocalInfo[] localInfoArr6 = this.val$locals;
                                    if (smallUleb1284 < localInfoArr6.length) {
                                        localInfoArr6[smallUleb1284] = immutableRestartLocal;
                                    }
                                }
                                return immutableRestartLocal;
                            case 7:
                                return new ImmutablePrologueEnd(this.codeAddress);
                            case 8:
                                return new ImmutableEpilogueBegin(this.codeAddress);
                            case 9:
                                return new ImmutableSetSourceFile(this.codeAddress, DebugInfoImpl.this.dexFile.getStringSection().getOptional(dexReader2.readSmallUleb128() - 1));
                            default:
                                this.codeAddress = ((ubyte - 10) / 15) + this.codeAddress;
                                this.lineNumber = ((r0 % 15) - 4) + this.lineNumber;
                                return new ImmutableLineNumber(this.codeAddress, this.lineNumber);
                        }
                    }
                }
            };
        }

        @Override // org.jf.dexlib2.dexbacked.util.DebugInfo
        public VariableSizeIterator<String> getParameterNames(DexReader dexReader) {
            if (dexReader == null) {
                dexReader = this.dexFile.getDataBuffer().readerAt(this.debugInfoOffset);
                dexReader.skipUleb128();
            }
            return new VariableSizeIterator<String>(dexReader, dexReader.readSmallUleb128()) { // from class: org.jf.dexlib2.dexbacked.util.DebugInfo.DebugInfoImpl.4
                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeIterator
                public String readNextItem(DexReader dexReader2, int i10) {
                    return DebugInfoImpl.this.dexFile.getStringSection().getOptional(dexReader2.readSmallUleb128() - 1);
                }
            };
        }
    }

    public static class EmptyDebugInfo extends DebugInfo {
        public static final EmptyDebugInfo INSTANCE = new EmptyDebugInfo();

        private EmptyDebugInfo() {
        }

        @Override // org.jf.dexlib2.dexbacked.util.DebugInfo
        public Iterator<String> getParameterNames(DexReader dexReader) {
            int i10 = v.f18759c;
            return w0.f18781j.iterator();
        }

        @Override // org.jf.dexlib2.dexbacked.util.DebugInfo
        public int getSize() {
            return 0;
        }

        @Override // java.lang.Iterable
        public Iterator<DebugItem> iterator() {
            int i10 = v.f18759c;
            return w0.f18781j.iterator();
        }
    }

    public static DebugInfo newOrEmpty(DexBackedDexFile dexBackedDexFile, int i10, DexBackedMethodImplementation dexBackedMethodImplementation) {
        return i10 == 0 ? EmptyDebugInfo.INSTANCE : new DebugInfoImpl(dexBackedDexFile, i10, dexBackedMethodImplementation);
    }

    public abstract Iterator<String> getParameterNames(DexReader dexReader);

    public abstract int getSize();
}

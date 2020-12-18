/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package event.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Event extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8921217263812467094L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"event.avro\",\"fields\":[{\"name\":\"charging\",\"type\":\"int\"},{\"name\":\"charging_source\",\"type\":\"string\"},{\"name\":\"current_capacity\",\"type\":\"int\"},{\"name\":\"moduleL_temp\",\"type\":\"int\"},{\"name\":\"moduleR_temp\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Event> ENCODER =
      new BinaryMessageEncoder<Event>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Event> DECODER =
      new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Event> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Event> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Event> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Event to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Event from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Event instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Event fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int charging;
   private java.lang.CharSequence charging_source;
   private int current_capacity;
   private int moduleL_temp;
   private int moduleR_temp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Event() {}

  /**
   * All-args constructor.
   * @param charging The new value for charging
   * @param charging_source The new value for charging_source
   * @param current_capacity The new value for current_capacity
   * @param moduleL_temp The new value for moduleL_temp
   * @param moduleR_temp The new value for moduleR_temp
   */
  public Event(java.lang.Integer charging, java.lang.CharSequence charging_source, java.lang.Integer current_capacity, java.lang.Integer moduleL_temp, java.lang.Integer moduleR_temp) {
    this.charging = charging;
    this.charging_source = charging_source;
    this.current_capacity = current_capacity;
    this.moduleL_temp = moduleL_temp;
    this.moduleR_temp = moduleR_temp;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return charging;
    case 1: return charging_source;
    case 2: return current_capacity;
    case 3: return moduleL_temp;
    case 4: return moduleR_temp;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: charging = (java.lang.Integer)value$; break;
    case 1: charging_source = (java.lang.CharSequence)value$; break;
    case 2: current_capacity = (java.lang.Integer)value$; break;
    case 3: moduleL_temp = (java.lang.Integer)value$; break;
    case 4: moduleR_temp = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'charging' field.
   * @return The value of the 'charging' field.
   */
  public int getCharging() {
    return charging;
  }


  /**
   * Sets the value of the 'charging' field.
   * @param value the value to set.
   */
  public void setCharging(int value) {
    this.charging = value;
  }

  /**
   * Gets the value of the 'charging_source' field.
   * @return The value of the 'charging_source' field.
   */
  public java.lang.CharSequence getChargingSource() {
    return charging_source;
  }


  /**
   * Sets the value of the 'charging_source' field.
   * @param value the value to set.
   */
  public void setChargingSource(java.lang.CharSequence value) {
    this.charging_source = value;
  }

  /**
   * Gets the value of the 'current_capacity' field.
   * @return The value of the 'current_capacity' field.
   */
  public int getCurrentCapacity() {
    return current_capacity;
  }


  /**
   * Sets the value of the 'current_capacity' field.
   * @param value the value to set.
   */
  public void setCurrentCapacity(int value) {
    this.current_capacity = value;
  }

  /**
   * Gets the value of the 'moduleL_temp' field.
   * @return The value of the 'moduleL_temp' field.
   */
  public int getModuleLTemp() {
    return moduleL_temp;
  }


  /**
   * Sets the value of the 'moduleL_temp' field.
   * @param value the value to set.
   */
  public void setModuleLTemp(int value) {
    this.moduleL_temp = value;
  }

  /**
   * Gets the value of the 'moduleR_temp' field.
   * @return The value of the 'moduleR_temp' field.
   */
  public int getModuleRTemp() {
    return moduleR_temp;
  }


  /**
   * Sets the value of the 'moduleR_temp' field.
   * @param value the value to set.
   */
  public void setModuleRTemp(int value) {
    this.moduleR_temp = value;
  }

  /**
   * Creates a new Event RecordBuilder.
   * @return A new Event RecordBuilder
   */
  public static event.avro.Event.Builder newBuilder() {
    return new event.avro.Event.Builder();
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Event RecordBuilder
   */
  public static event.avro.Event.Builder newBuilder(event.avro.Event.Builder other) {
    if (other == null) {
      return new event.avro.Event.Builder();
    } else {
      return new event.avro.Event.Builder(other);
    }
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Event instance.
   * @param other The existing instance to copy.
   * @return A new Event RecordBuilder
   */
  public static event.avro.Event.Builder newBuilder(event.avro.Event other) {
    if (other == null) {
      return new event.avro.Event.Builder();
    } else {
      return new event.avro.Event.Builder(other);
    }
  }

  /**
   * RecordBuilder for Event instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event>
    implements org.apache.avro.data.RecordBuilder<Event> {

    private int charging;
    private java.lang.CharSequence charging_source;
    private int current_capacity;
    private int moduleL_temp;
    private int moduleR_temp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(event.avro.Event.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.charging)) {
        this.charging = data().deepCopy(fields()[0].schema(), other.charging);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.charging_source)) {
        this.charging_source = data().deepCopy(fields()[1].schema(), other.charging_source);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.current_capacity)) {
        this.current_capacity = data().deepCopy(fields()[2].schema(), other.current_capacity);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.moduleL_temp)) {
        this.moduleL_temp = data().deepCopy(fields()[3].schema(), other.moduleL_temp);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.moduleR_temp)) {
        this.moduleR_temp = data().deepCopy(fields()[4].schema(), other.moduleR_temp);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Event instance
     * @param other The existing instance to copy.
     */
    private Builder(event.avro.Event other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.charging)) {
        this.charging = data().deepCopy(fields()[0].schema(), other.charging);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.charging_source)) {
        this.charging_source = data().deepCopy(fields()[1].schema(), other.charging_source);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.current_capacity)) {
        this.current_capacity = data().deepCopy(fields()[2].schema(), other.current_capacity);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.moduleL_temp)) {
        this.moduleL_temp = data().deepCopy(fields()[3].schema(), other.moduleL_temp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.moduleR_temp)) {
        this.moduleR_temp = data().deepCopy(fields()[4].schema(), other.moduleR_temp);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'charging' field.
      * @return The value.
      */
    public int getCharging() {
      return charging;
    }


    /**
      * Sets the value of the 'charging' field.
      * @param value The value of 'charging'.
      * @return This builder.
      */
    public event.avro.Event.Builder setCharging(int value) {
      validate(fields()[0], value);
      this.charging = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'charging' field has been set.
      * @return True if the 'charging' field has been set, false otherwise.
      */
    public boolean hasCharging() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'charging' field.
      * @return This builder.
      */
    public event.avro.Event.Builder clearCharging() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'charging_source' field.
      * @return The value.
      */
    public java.lang.CharSequence getChargingSource() {
      return charging_source;
    }


    /**
      * Sets the value of the 'charging_source' field.
      * @param value The value of 'charging_source'.
      * @return This builder.
      */
    public event.avro.Event.Builder setChargingSource(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.charging_source = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'charging_source' field has been set.
      * @return True if the 'charging_source' field has been set, false otherwise.
      */
    public boolean hasChargingSource() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'charging_source' field.
      * @return This builder.
      */
    public event.avro.Event.Builder clearChargingSource() {
      charging_source = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'current_capacity' field.
      * @return The value.
      */
    public int getCurrentCapacity() {
      return current_capacity;
    }


    /**
      * Sets the value of the 'current_capacity' field.
      * @param value The value of 'current_capacity'.
      * @return This builder.
      */
    public event.avro.Event.Builder setCurrentCapacity(int value) {
      validate(fields()[2], value);
      this.current_capacity = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'current_capacity' field has been set.
      * @return True if the 'current_capacity' field has been set, false otherwise.
      */
    public boolean hasCurrentCapacity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'current_capacity' field.
      * @return This builder.
      */
    public event.avro.Event.Builder clearCurrentCapacity() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'moduleL_temp' field.
      * @return The value.
      */
    public int getModuleLTemp() {
      return moduleL_temp;
    }


    /**
      * Sets the value of the 'moduleL_temp' field.
      * @param value The value of 'moduleL_temp'.
      * @return This builder.
      */
    public event.avro.Event.Builder setModuleLTemp(int value) {
      validate(fields()[3], value);
      this.moduleL_temp = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'moduleL_temp' field has been set.
      * @return True if the 'moduleL_temp' field has been set, false otherwise.
      */
    public boolean hasModuleLTemp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'moduleL_temp' field.
      * @return This builder.
      */
    public event.avro.Event.Builder clearModuleLTemp() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'moduleR_temp' field.
      * @return The value.
      */
    public int getModuleRTemp() {
      return moduleR_temp;
    }


    /**
      * Sets the value of the 'moduleR_temp' field.
      * @param value The value of 'moduleR_temp'.
      * @return This builder.
      */
    public event.avro.Event.Builder setModuleRTemp(int value) {
      validate(fields()[4], value);
      this.moduleR_temp = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'moduleR_temp' field has been set.
      * @return True if the 'moduleR_temp' field has been set, false otherwise.
      */
    public boolean hasModuleRTemp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'moduleR_temp' field.
      * @return This builder.
      */
    public event.avro.Event.Builder clearModuleRTemp() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Event build() {
      try {
        Event record = new Event();
        record.charging = fieldSetFlags()[0] ? this.charging : (java.lang.Integer) defaultValue(fields()[0]);
        record.charging_source = fieldSetFlags()[1] ? this.charging_source : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.current_capacity = fieldSetFlags()[2] ? this.current_capacity : (java.lang.Integer) defaultValue(fields()[2]);
        record.moduleL_temp = fieldSetFlags()[3] ? this.moduleL_temp : (java.lang.Integer) defaultValue(fields()[3]);
        record.moduleR_temp = fieldSetFlags()[4] ? this.moduleR_temp : (java.lang.Integer) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Event>
    WRITER$ = (org.apache.avro.io.DatumWriter<Event>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Event>
    READER$ = (org.apache.avro.io.DatumReader<Event>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.charging);

    out.writeString(this.charging_source);

    out.writeInt(this.current_capacity);

    out.writeInt(this.moduleL_temp);

    out.writeInt(this.moduleR_temp);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.charging = in.readInt();

      this.charging_source = in.readString(this.charging_source instanceof Utf8 ? (Utf8)this.charging_source : null);

      this.current_capacity = in.readInt();

      this.moduleL_temp = in.readInt();

      this.moduleR_temp = in.readInt();

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.charging = in.readInt();
          break;

        case 1:
          this.charging_source = in.readString(this.charging_source instanceof Utf8 ? (Utf8)this.charging_source : null);
          break;

        case 2:
          this.current_capacity = in.readInt();
          break;

        case 3:
          this.moduleL_temp = in.readInt();
          break;

        case 4:
          this.moduleR_temp = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











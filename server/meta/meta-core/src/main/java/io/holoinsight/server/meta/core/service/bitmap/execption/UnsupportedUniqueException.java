/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package io.holoinsight.server.meta.core.service.bitmap.execption;

import java.util.Arrays;

/**
 * Exception for
 * com.alipay.pontus.core.table.service.DimService#queryByUnique(com.alipay.pontus.core.table.DimTable,
 * java.util.Map)
 *
 * @author wangfei
 * @version $Id: UnsupportedUniqueException.java, v 0.1 2019年07月30日 10:07 PM wangfei Exp $
 */
public class UnsupportedUniqueException extends Exception {

  public UnsupportedUniqueException(String table, String[] indexCols) {
    super();
    this.table = table;
    this.indexCols = indexCols;
  }

  private String table;
  private String[] indexCols;

  public String getTable() {
    return table;
  }

  public String[] getIndexCols() {
    return indexCols;
  }

  @Override
  public String getMessage() {
    return String.format("The index%s is not a unique index for table[%s].", table,
        Arrays.toString(indexCols));
  }
}
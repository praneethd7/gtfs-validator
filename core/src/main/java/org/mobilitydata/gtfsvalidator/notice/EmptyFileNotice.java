/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mobilitydata.gtfsvalidator.notice;

import static org.mobilitydata.gtfsvalidator.annotation.GtfsValidationNotice.SectionRef.FILE_REQUIREMENTS;
import static org.mobilitydata.gtfsvalidator.notice.SeverityLevel.ERROR;

import org.mobilitydata.gtfsvalidator.annotation.GtfsValidationNotice;
import org.mobilitydata.gtfsvalidator.annotation.GtfsValidationNotice.SectionRefs;

/**
 * A CSV file is empty.
 *
 * <p>Empty csv file found in the archive: file does not have any headers, or is a required file and
 * does not have any data. The GTFS specification requires the first line of each file to contain
 * field names and required files must have data.
 */
@GtfsValidationNotice(severity = ERROR, sections = @SectionRefs(FILE_REQUIREMENTS))
public class EmptyFileNotice extends ValidationNotice {

  /** The name of the faulty file. */
  private final String filename;

  public EmptyFileNotice(String filename) {
    super(SeverityLevel.ERROR);
    this.filename = filename;
  }
}
